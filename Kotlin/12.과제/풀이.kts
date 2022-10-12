//1번.
fun StringNum(x: String, y: Int) {

    for (i in 0 until y) println(x) // 1번째 방법
//  for (i in 0..y - 1) println(x) // 2번째 방법
//  for (i in 1..y) println(x) // 3번째 방법

}
StringNum("안녕", 10)

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
fun Sum7() {
    var sum: Int = 0
    for (i in 1..100) {
        if (i % 7 == 0)
            sum += i
    }
    println(sum)
}
Sum7()

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
            if (i + j == 6) result.add(listOf<Int>(i, j))
        }
    }
    println(result)
}
Dice()

//7번.
fun Eat(x: Int, y: Int) {
    var count = y
    do {
        println("밥을 먹었다")
        count++
    } while (x > count)
    println("배가 부르다")
}
Eat(3, 2)

//8번.
fun Soldier(
    soldier1: List<String>,
    soldier2: List<String>,
    removal: Int
): List<List<String>>? {
    if (soldier1.size < removal || soldier2.size < removal) return null

    val temp1 = mutableListOf<String>()
    val temp2 = mutableListOf<String>()

    for ((index, soldier) in soldier1.withIndex()) {
        if (index != removal) temp1.add(soldier)
    }
    for ((index, soldier) in soldier2.withIndex()) {
        if (index != removal) temp2.add(soldier)
    }
    val result = listOf<List<String>>( temp1, temp2)
    return result
}
println(
    Soldier(
        soldier1 = listOf<String>("A", "B", "C", "D", "E"),
        soldier2 = listOf<String>("A", "B", "C"),
        removal = 2
    )
)

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
