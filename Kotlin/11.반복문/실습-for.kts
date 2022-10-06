// for문
// range
for (value in 0..3) {
    println("반복")
}

// Progression + step
for (value in 0..5 step (2)) {
    println("반복 1")
}

// Progression + downTo
for (value in 5 downTo 0) {
    println("반복 2")
}

// Collection
val numbers = listOf<Int>(5, 6, 7, 8)
for (number in numbers) {
    println(number)
}

for (i in 0..numbers.size) { // 0..4
    println("반복 3")
}

for (i in 0 until numbers.size){ // 0..3
    println("반복 4")
}

for((index,number) in numbers.withIndex()){
    println("" + index + "  |  " + number)
}

//forEach
numbers.forEach { number ->
    println(number)
}