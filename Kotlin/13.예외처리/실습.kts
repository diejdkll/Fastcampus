import java.lang.Exception

val numbers = listOf<Int>(1, 2, 3)
try {
    numbers.get(5)
} catch (exception: Exception) { // 모든 종류의 예외처리 (권장하지 않음)
    println(exception) // 예외타입 알아내기
}

try {
    numbers.get(5)
} catch (exception: IllegalArgumentException) { // 작동 안함
    println("예외 발생 A")
} catch (exception: ArrayIndexOutOfBoundsException) { // 예외 처리
    println("예외 발생 B")
} finally { // 무조건 실행
    println("마지막!")
}