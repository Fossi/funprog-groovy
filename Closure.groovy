def twice = {int operand -> operand+operand}

println twice(2)



//Closures have access to variables outside their immediate scope
def offset = 1

def twice2 = {int operand -> operand + operand + offset}

println twice2(2)
