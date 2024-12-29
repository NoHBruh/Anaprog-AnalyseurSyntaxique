from fuzzingbook import bookutils
from fuzzingbook.GeneratorGrammarFuzzer import GeneratorGrammarFuzzer
from urllib.parse import quote, quote_from_bytes
from fuzzerGrammars import URLQUOTE_ORACLE_GRAMMAR

urlquote_fuzzer = GeneratorGrammarFuzzer(URLQUOTE_ORACLE_GRAMMAR)
nb_fuzz = 100000
for i in range(nb_fuzz) :
    test = urlquote_fuzzer.fuzz()
    print(test)
    exec(test)