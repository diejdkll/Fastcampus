// While문
var i = 0
while(i < 5){
    println(i)
    if(i%2 == 0){
        println("짝수")
    }
    else{
        println("홀수")
    }
    i++ // 이부분을 제거하면 무한루프에 빠진다(루프(loop) : 반복)
}

// Do/While문
var z = 10
do{
    println("시작")
    z++
}while(z < 20)