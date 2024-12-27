package be.unamur.info.infom227.ast

import scala.collection.mutable
import scala.util.{Failure, Success, Try}

class ExampleSymbolTable(private val parentSymbolTableOption: Option[ExampleSymbolTable] = None) {

  private val symbols = mutable.HashMap[String, ExampleType]()
  private val mySymbols = mutable.HashMap[String, Any]()

  def gets(name: String, recursive: Boolean = true): Try[ExampleType] = {
    symbols.get(name) match {
      case Some(value) => Success(value)
      case None => parentSymbolTableOption match {
        case Some(parentSymbolTable) if recursive => parentSymbolTable.get(name, recursive)
        case _ => Failure(new NoSuchElementException(s"Undefined variable : $name"))
      }
    }
  }

  def defines(name: String, exampleType: ExampleType): Try[Unit] = {
    if (symbols.contains(name)) {
      Failure(new IllegalArgumentException(s"Variable already defined : $name"))
    } else {
      symbols.put(name, exampleType)
      Success(())
    }
  }

  def get(name: String, recursive: Boolean = true): Try[Any] = {
    mySymbols.get(name) match {
      case Some(value) => Success(value)
      case None => parentSymbolTableOption match {
        case Some(parentSymbolTable) if recursive => parentSymbolTable.get(name, recursive)
        case _ => Failure(new NoSuchElementException(s"Undefined variable : $name"))
      }
    }
  }

  def define(name: String, exampleType: ExampleType): Try[Unit] = {
    if (mySymbols.contains(name)) {
      Failure(new IllegalArgumentException(s"Variable already defined : $name"))
    } else {
      mySymbols.put(name, exampleType)
      Success(())
    }
  }

  def isIn(name:String): Boolean = {
    if(mySymbols.contains(name)) true else false
  }

  override def toString: String = mySymbols.toString()
}
