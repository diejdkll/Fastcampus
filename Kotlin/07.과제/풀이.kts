// 1.
var A: Int = 10
var B: Int = 10
var C: Boolean = if (A == B) true else false
println(C)

// 2.
var A2: Int = 10
var B2: Int = A2 * 2
println(B2)

// 3.
fun testScore(score: Int): String {
    // if
    if (score >= 90) return "A"
    else if (score >= 80) return "B"
    else if (score >= 70) return "C"
    else return "F"

    // when
    when (score) {
        in 90..100 -> return "A"
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        else -> return "F"
    }
}

// 4.
fun testCount(A: Int): Int {
    return A * 5
}

// 5.
fun nullableSum(A: Int?, B: Int?): Int?{
    var AA: Int = if(A == null) 0 else A
    var BB: Int = if(B == null) 0 else B
    return AA + BB
}

