def sumLoop(upTo){
    int sum = 0
    for (int i=0; i<upTo; i++){
       sum = sum + i
    }
    return sum
}

def sumRecursion(Integer upTo) {
    if (upTo==0) return 0
    else return upTo+sumRecursion(upTo-1)
}

println sumLoop(19)
println sumRecursion(19)

println sumRecursion(10000)
