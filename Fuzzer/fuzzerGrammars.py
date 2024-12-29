from fuzzingbook.Grammars import is_valid_grammar, opts, extend_grammar, Grammar

# Grammaire de base
URL_GRAMMAR: Grammar = {
    "<start>":
        ["<url>"],
    "<url>":
        ["<scheme>://<authority><path><query>"],
    "<scheme>": #tous les schemes supportés par le module parse
        ["file", "ftp", "gopher", "hdl", "http", "https", "imap", "itms-services", "mailto", "mms", "news", "nntp",
         "prospero", "rsync", "rtsp", "rtsps", "rtspu", "sftp", "shttp", "sip", "sips", "snews", "svn", "svn+ssh",
         "telnet", "wais", "ws", "wss"],
    "<authority>":
        ["<host>", "<host>:<port>", "<userinfo>@<host>", "<userinfo>@<host>:<port>"],
    "<host>":  # quelques-uns
        ["python.org", "www.google.com", "fuzzingbook.com", "www.youtube.com"],
    "<port>":
        ["80", "8080", "<nat>"],
    "<nat>":
        ["<digit>", "<digit><digit>"],
    "<digit>":
        ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"],
    "<userinfo>":  # 1 example
        ["user:password"],
    "<path>":  # quelques-uns
        ["", "/", "/<id>"],
    "<id>":  # quelques-uns
        ["abc", "def", "x<digit><digit>"],
    "<query>":
        ["", "?<params>"],
    "<params>":
        ["<param>", "<param>&<params>"],
    "<param>":  # quelques-uns
        ["<id>=<id>", "<id>=<nat>"],
}


# ----------Grammaires pour le parsing et définition de l'oracle------------------

URLPARSE_GRAMMAR: Grammar = {
    "<call>":
        ['urlparse("<url>")']
}

#Mise à jour de la grammaire
URLPARSE_GRAMMAR.update(URL_GRAMMAR)
URLPARSE_GRAMMAR["<start>"] = ["<call>"]

assert is_valid_grammar(URLPARSE_GRAMMAR)



URLPARSE_ORACLE_GRAMMAR: Grammar = extend_grammar(URLPARSE_GRAMMAR,
{
     "<call>": [("assert urlparse('<url>').geturl() == '<url>'",
                 opts(post=lambda url_1, url_2: [None, url_1]))]
})



# ----------Grammaires pour le quoting et définition de l'oracle-------------------
URLQUOTE_GRAMMAR : Grammar ={
    "<call>":
        ['quote("<url>")']
}
#Mise à jour de la grammaire
URLQUOTE_GRAMMAR.update(URL_GRAMMAR)
URLQUOTE_GRAMMAR["<start>"] = ["<call>"]

assert is_valid_grammar(URLQUOTE_GRAMMAR)



URLQUOTE_ORACLE_GRAMMAR : Grammar = extend_grammar(URLQUOTE_GRAMMAR,
{
        "<call>" : [("assert quote('<url>') == quote_from_bytes('<url>'.encode())",
                     opts(post = lambda url_1, url_2: [None, url_1]))]   
})