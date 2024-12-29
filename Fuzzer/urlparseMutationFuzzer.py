from fuzzingbook.MutationFuzzer import MutationFuzzer, MutationCoverageFuzzer
from fuzzingbook.GrammarFuzzer import GrammarFuzzer
from fuzzingbook.Grammars import URL_GRAMMAR
from urllib.parse import urlparse

nb_seeds = 10
urlparse_fuzzer = MutationFuzzer(seed=[GrammarFuzzer(grammar=URL_GRAMMAR)for _ in range(nb_seeds)])

for i in range(100000) :
    fuzz = urlparse_fuzzer.fuzz()
    assert urlparse(fuzz).geturl() == fuzz 