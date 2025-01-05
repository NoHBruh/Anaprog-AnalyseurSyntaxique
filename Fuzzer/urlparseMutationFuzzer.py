from fuzzingbook.MutationFuzzer import MutationFuzzer
from fuzzingbook.GrammarFuzzer import simple_grammar_fuzzer
from fuzzerGrammars import URL_GRAMMAR
from urllib.parse import urlparse

nb_seeds = 15
urlparse_fuzzer = MutationFuzzer(seed=[simple_grammar_fuzzer(grammar=URL_GRAMMAR)for _ in range(nb_seeds)])

for i in range(1000) :
    fuzz = urlparse_fuzzer.fuzz()
    print("Iter : " + str(i) +"\n")
    print("fuzz :" + fuzz +"\n") 
    print("result :" + urlparse(fuzz).geturl())
    print("----------------\n" )
    assert urlparse(fuzz.lower()).geturl() == fuzz.lower()