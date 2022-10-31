// 기본자료형의 타입 캐스팅
val number: Int = 10
val numberString: String = number.toString() // Int -> String
println(numberString)

val StringToNumber: Int = numberString.toInt() // String -> Int
println(StringToNumber)

val NumberD: Double = 10.5
val NumberDString: String = NumberD.toString() // Double -> String
println(NumberDString)

val NumberDInt: Int = NumberD.toInt() // Double -> Int
println(NumberDInt)
// -> to타입이 오는 함수를 사용해서 형변환

// 상속한 클래스간의 캐스팅
open class Warrior(var name: String, var power: Int, var type: String) {
    open fun attack() {
        println("공격")
    }
}

class DefenseWarrior constructor(name: String, power: Int) : Warrior(name, power, "고블린") {
    fun defense() {
        println("방어")
    }
}

// is
// - 타입 체크
// - boolean(true, false)
// - 스마트 캐스팅
// - var은 불가능 -> val을 사용해야 함
val warrior: Warrior = DefenseWarrior("탱커", 100)
//warrior.defense() // -> 불가능(defense기능을 버리고 Warrior타입이 됨)

if(warrior is DefenseWarrior){ // warrior는 DefenseWarrior인가?
    println("YES")
    // 스마트 캐스팅
    // 내가 만든 warrior를 DefenseWarrior로 사용하게 해줌
    warrior.defense()
}

// as
// - 지정한 타입으로 캐스팅을 시도, 불가능한 경우에는 예외 발생
val warrior2: DefenseWarrior = warrior as DefenseWarrior // warrior -> DefenseWarrior
warrior2.defense()