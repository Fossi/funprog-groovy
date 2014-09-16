def range = 1..10

println range.findAll { it%2==0 }

println range.collect { it + 1 }

//for side-effects
range.each { println it  }

println range.inject{ sum, it-> sum + it }