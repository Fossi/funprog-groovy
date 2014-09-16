def string="a merry song"

def tokenize ={it.split ' '}
def shout = {it.toUpperCase()}

//naive version
println tokenize(shout(string))

//new method
def loudTokens = {
    tokenize(shout(it))
}
println loudTokens(string)

//new method2
loudTokens = {
    def loud = shout(it)
    tokenize(loud)
}
println loudTokens(string)


//FP to the rescue
loudTokens = tokenize << shout
println loudTokens(string)
