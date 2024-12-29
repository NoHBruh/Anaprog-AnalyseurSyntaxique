from fuzzingbook import bookutils
from fuzzingbook.GeneratorGrammarFuzzer import GeneratorGrammarFuzzer
from urllib.parse import urlparse
from fuzzerGrammars import URLPARSE_ORACLE_GRAMMAR


urlparse_fuzzer = GeneratorGrammarFuzzer(URLPARSE_ORACLE_GRAMMAR)
nb_fuzz = 100000
for i in range(nb_fuzz) :
    test = urlparse_fuzzer.fuzz()
    print(test)
    exec(test)