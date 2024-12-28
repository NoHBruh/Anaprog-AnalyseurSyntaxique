from fuzzingbook.MutationFuzzer import MutationFuzzer
from fuzzingbook.GrammarFuzzer import simple_grammar_fuzzer
from fuzzingbook.Grammars import URL_GRAMMAR
from urllib.parse import urlparse

nb_seeds = 10
urlparse_fuzzer = MutationFuzzer(seed=[simple_grammar_fuzzer(grammar=URL_GRAMMAR, max_nonterminals=10)for _ in range(nb_seeds)])

for i in range(100000) :
    fuzz = urlparse_fuzzer.fuzz()
    assert urlparse(fuzz).geturl() == fuzz 