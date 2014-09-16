localLine = [marker:'local', line:'0 Bob - Trying to tell you something']
mrpeLine = [marker:'mrpe', line:'Alice OK - vat are you zayink?']

def tokenize = {it.split ' '}

def isOk={logLine, tokenPosition, shouldBe->
    tokenize(logLine)[tokenPosition]==shouldBe
}

def localParser = {string -> 'local check ok: ' + isOk(string, 0, '0')}
def mrpeParser = {string -> 'mrpe check ok: ' + isOk(string, 1,'OK')}


def determineParser={
    if (it == 'local') return localParser
    if (it == 'mrpe') return mrpeParser
}

println determineParser(localLine['marker'])(localLine['line'])
println determineParser(mrpeLine['marker'])(mrpeLine['line'])

