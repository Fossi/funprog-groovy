def string="a merry song"
def string2="to-sing-today"

def tokenizeBy ={separator, text  ->text.split separator}
def shout = {it.toUpperCase()}


loudTokens = {separator -> tokenizeBy.curry(separator) << shout}


println loudTokens(' ')(string)
println loudTokens('-')(string2)

