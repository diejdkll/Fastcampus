val numbers = intArrayOf(5,10,15)

// 값만 필요함
for(number in numbers){ // forEach
    println(number)
}
println("---------------------------")

// 값과 인덱스 모두 필요할 때
for((index, value) in numbers.withIndex()){ // forEachIndexed
    println(index)
    println(value)
}
println("---------------------------")

// 인덱스만 필요할 때
for(index in numbers.indices){
    println(index)
}
println("---------------------------")

// 본문에서 사용될 변수 이름을 기본 제공으로 사용
numbers.forEachIndexed { index, i ->

}

// 본문에서 사용될 변수 이름을 변경해서 사용
numbers.forEachIndexed { index, value ->

}