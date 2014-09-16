import groovy.transform.TailRecursive

@TailRecursive
Integer sumRecursion(Integer upTo, offset) {
    if (upTo==0) return offset
    else return sumRecursion(upTo-1, offset+upTo)
}

println sumRecursion(10000, 0)