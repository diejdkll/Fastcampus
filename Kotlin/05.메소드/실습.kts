// 함수를 선언하는 방법
fun plusNumbers(firstNum: Int, secondNum: Int):Int{
    var result :Int = firstNum + secondNum;
    return result
}

// 함수를 사용(호출)하는 방법
plusNumbers(firstNum = 10, secondNum = 20) // -> 30
plusNumbers(10, 20) // -> 30

var result: Int = plusNumbers(5, 7)
println(result)

//기본값이 있는 함수를 선언하는 방법
fun plusNumbersWithDefault(firstNum: Int, secondNum: Int = 10):Int{
    return firstNum + secondNum
}

var result2 = plusNumbersWithDefault(10)
println(result2)

var result3 = plusNumbersWithDefault(10, 20)
println(result3)

// 반환값이 없는 함수를 선언하는 방법
fun plusNumbersWithNoResult(firstNum:Int, secondNum:Int): Unit{
    var result: Int = firstNum + secondNum
    println(result)
}

fun plusNumbersWithNoResult2(firstNum:Int, secondNum:Int){
    var result: Int = firstNum + secondNum
    println(result)
}

fun plusNumbersWithNoResult3(firstNum:Int, secondNum:Int){
    var result: Int = firstNum + secondNum
    println(result)
    return
}

plusNumbersWithNoResult(100, 200)

plusNumbersWithNoResult2(100, 200)

plusNumbersWithNoResult3(100, 200)