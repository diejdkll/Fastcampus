// break
println("break------------------------------")
for (i in 1..3) { // i반복문
    println("i : " + i)
    for (j in 1..3) { // j반복문
        if (j == 2) break // 구문1
        else println("j : " + j) // 구문2
    }
}
// i(1) -> j(1)/구문1 -> j(1)/구문2 -> j(2)/구문1 -> i(2) -> j(1)/구문1 -> j(1)/구문2 -> j(2)/구문1 -> i(3)...
println("break + label------------------------------")

// break + label
loop@ for (i in 1..3) { // i반복문
    println("i : " + i)
    for (j in 1..3) { // j반복문
        if (j == 2) break@loop // 구문1
        else println("j : " + j) // 구문2
    }
}
// i(1) -> j(1)/구문1 -> j(1)/구문2 -> j(2)/구문1 -> loop탈출(i반복문)
println("continue------------------------------")

// continue
for (i in 1..3) { // i반복문
    println("i : " + i)
    for (j in 1..3) { // j반복문
        if (j == 2) continue // 구문1
        else println("j : " + j) // 구문2
    }
}
//i(1) -> j(1)/구문1 -> j(1)/구문2 -> j(2)/구문1 -> j(3)/구문1 -> j(3)->구문2 -> i(2)...
println("continue + label------------------------------")

// continue + label
loop@ for (i in 1..3) { // i반복문
    println("i : " + i)
    for (j in 1..3) { // j반복문
        if (j == 2) continue@loop // 구문1
        else println("j : " + j) // 구문2
    }
}
// i(1) -> j(1)/구문1 -> j(1)/구문2 -> j(2)/구문 -> i(2) -> j(1)/구문1 -> j(1)/구문2 -> i(3) -> -> j(1)/구문1 -> j(1)/구문2
println("return------------------------------")

// return
fun returnFunction(): Unit {
    for (i in 1..3) { // i반복문
        println("i : " + i)
        for (j in 1..3) {// j반복문
            if (j == 2) return // 구문1
            else println("j : " + j) // 구문2
        }
    }
}
returnFunction()
// i(1) -> j(1)/구문1 -> j(1)/구문2 -> j(2)/구문1
println("foreach------------------------------")

// forEach + label
listOf(1, 2, 3).forEach loop@{
    if (it == 2) return@loop
    else println(it)
}
// forEach는 continue와 break 사용 불가