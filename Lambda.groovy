def x = {int i -> i+i}(23)
def y = {it+it}(23)

assert x==y

println "x: ${x} y: ${y}"
