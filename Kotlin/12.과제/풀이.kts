//1번.
fun CharNum(x: Char, y: Int) {

    for (i in 0 until y) {
        println(x)
    }
}
CharNum('A', 10)

//2번.
fun Sum(x: Int) {
    var sum: Int = 0
    for (i in 1..x) {
        sum += i
    }
    println(sum)
}
Sum(10)

//3번.
fun Sum2() {
    var sum: Int = 0
    for (i in 1..100) {
        if (i % 7 == 0)
            sum += i
    }
    println(sum)
}
Sum2()

//4번.
fun End(x: Int) {
    if (x >= 100) return
    else {
        var num: Int = x
        while (num != 100) {
            num++
        }
    }
}
End(10)

//5번.
fun Arr() {
    var arr = arrayOf(70, 71, 72, 77, 78, 79, 80, 82, 90, 99)
    var arr2 = BooleanArray(arr.size, { false })

    for (i in 0 until arr.size) {
        if (arr[i] >= 80) arr2[i] = true
    }
    arr2.forEach { println(it) }
}
Arr()

//6번.
fun Dice() {
    var result = mutableListOf<List<Int>>()
    for (i in 1..6) {
        for (j in 1..6) {
            if (i + j == 6) {
                result.add(listOf<Int>(i, j))
            }
        }
    }
    println(result)
}
Dice()

//7번.
fun Eat(x: Int, y: Int) {
    if (x > y) {
        for (i in 1..(x - y)) {
            println("밥을 먹었다")
        }
        println("배가 부르다")
    } else println("배가 부르다")
}
Eat(3, 2)

//8번.

//9번.
fun MultiplicationTable(x: Int) {
    var list = mutableListOf<Int>()
    for (i in 1..9) {
        list.add(x * i)
    }
    println(list)
}
MultiplicationTable(3)

//10번.