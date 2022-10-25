// Scope
var number: Int = 1

fun changeNumber() {
    var internalNumber: Int = 2
    number = 20 // 하위 스코프에서 상위 스코프 멤버버에 접근 가능
    var number: String = "재정의" // 하위 스코프에서 상위 멤버를 재정의 가능
    println(number)
}
changeNumber()
println(number)

//internalNumber = 30 -> 상위 스코프에서 하위 스코프 멤버에 접근 불가능
// 하위 -> 상위 접근 가능
// 상위 -> 하위 접근 불가능 -> 사실상 하위는 독립적

// 접근제한자
class Numbers(private var number: Int = 10) {
    fun changeNumber() {
        this.number = 100 // Numbers라는 스코프 안에 존재하기 때문에 접근/변경 가능
    }

    fun whatIsNumber(): Int {
        return this.number
    }

}

val numbers = Numbers()
println(numbers.whatIsNumber())
//println(numbers.number) -> Numbers 밖에 존재하기 때문에 접근/변경 불가능
//numbers.number = 100 -> Numbers 밖에 존재하기 때문에 접근/변경 불가능
numbers.changeNumber()
println(numbers.whatIsNumber())

// public -> 내가 포함되어 있는 범위 밖에서도 접근/변경 가능
// private -> 내가 포함되어 있는 범위 밖에서는 접근/변경 불가능
//         -> 내가 포함되어 있는 범위 안에서는 접근/변경 가능

