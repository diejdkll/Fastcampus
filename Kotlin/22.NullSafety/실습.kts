// ?
val nunber: Int = 10 // Non-Nullable Int
val number: Int? = null // Nullable Int

// !!
val nullableNumberList: List<Int?> = listOf<Int?>(1, 2, 3, 4, 5)
var result: Int = 0
nullableNumberList.forEach {
    result += it!!
}
// -> 정말 필요한 경우에만 사용

// ?. (Safe call)
val text: String? = null
println(text?.length)
//println(text.lenght) -> NullPointException이 발생 해야함

// !!.
//println(text!!.length) -> NullPointException이 발생 해야함

// as?
open class Warrior(var name: String, var power: Int, var type: String) {
    open fun attack() {
        println("공격")
    }
}

class DefenseWarrior constructor(name: String, power: Int){
    fun defense() {
        println("방어")
    }
}

val defenseWarrior = DefenseWarrior("", 100)
val warrior = defenseWarrior as? Warrior
println(warrior)

// ?: 엘비스 연산
val text2: String? = "123"
val nullText: String? = null

var len1: Int = if(text2 != null) text2.length else 0
var len2: Int = text2?.length ?: 0
