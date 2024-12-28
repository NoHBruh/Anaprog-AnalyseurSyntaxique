from fuzzingbook import bookutils
from fuzzingbook.Grammars import opts, extend_grammar, SimpleGrammar, is_valid_grammar
from fuzzingbook.Grammars import URL_GRAMMAR, START_SYMBOL
from fuzzingbook.ProbabilisticGrammarFuzzer import ProbabilisticGrammarFuzzer
from fuzzingbook.GeneratorGrammarFuzzer import GeneratorGrammarFuzzer
from typing import List, Dict, Union, Any, Tuple, Optional
from urllib.parse import urlparse



URLPARSE_GRAMMAR: SimpleGrammar = {
    "<call>":
        ['urlparse("<url>")']
}

# Import definitions from URL_GRAMMAR
URLPARSE_GRAMMAR.update(URL_GRAMMAR)
URLPARSE_GRAMMAR["<start>"] = ["<call>"]

assert is_valid_grammar(URLPARSE_GRAMMAR)




URLPARSE_ORACLE_GRAMMAR: SimpleGrammar = extend_grammar(URLPARSE_GRAMMAR,
{
     "<call>": [("assert urlparse('<url>').geturl() == '<url>'",
                 opts(post=lambda url_1, url_2: [None, url_1]))]
})

urlparse_fuzzer = GeneratorGrammarFuzzer(URLPARSE_ORACLE_GRAMMAR)

for i in range(15) :
    test = urlparse_fuzzer.fuzz()
    print(test)
    exec(test)