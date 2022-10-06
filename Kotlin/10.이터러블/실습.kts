// Range
val range1 = 1..10
println(range1)

val range2 = 1 until 10 // -> 1..9
println(range2)

val range3 = 'A'..'Z'
println(range3)
val range4 = 'ㄱ'..'ㅎ'
println(range4)

// Progression
val range5 = 1..10 step 2
// (1,2,3,4,5,,7,8,9,10) -> (1,3,5,7,9)
// (1,2,3,4,5,,7,8,9) -> (1,3,5,7,9)
println(range5)

val range6 = 10 downTo 1 step 2
println(range6)
// step
// - 특징 : step에 값과 상관없이 첫번재는 무조건 Index 0부터 시작한다

// Collection
val collection1 = listOf<Int>(1, 2, 3, 4, 5)

