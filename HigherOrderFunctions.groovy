String line = "Trying to tell you something"

def countWords = {string -> "wordcount: " + string.split(" ").size() }
def countLength = {String string -> "length: " + string.length()}

def facilitateLogging = {specimen, analyzer ->
	println analyzer(specimen)
}

facilitateLogging(line, countWords)
facilitateLogging(line, countLength)
