def expensiveOp={int number->
	sleep(1000)
	number
}.memoize()

(1..5).each{println expensiveOp(it)}
(1..10).each{println expensiveOp(it)}
(1..10).each{println expensiveOp(it)}
