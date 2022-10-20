class Calculator1 {
    var result: Int = 0
        set(number) {
            field = number
            println("result = " + field)
        }

    fun plus(value: Int) {
        result += value
    }

    fun minus(value: Int) {
        result -= value
    }

    fun multiplication(value: Int) {
        result *= value
    }

    fun division(value: Int) {
        result /= value
    }
}

val calculator1 = Calculator1()
calculator1.plus(10)
calculator1.minus(4)
calculator1.division(2)

class Calculator2(val number: Int = 0) {
    var result: Int = 0

    init {
        this.result = number
    }

    fun calculation(symbol: Char, value: Int){
        if(symbol == '+'){
            result += value
        }
        else if(symbol == '-'){
            result -= value
        }
        else if(symbol == '*'){
            result *= value
        }
        else if(symbol == '/'){
            result /= value
        }
        else println("잘못된 연산 입니다")
    }
}

val calculator2 = Calculator2(10)
calculator2.calculation('+', 10)
calculator2.calculation('-', 4)
calculator2.calculation('/', 2)
println(calculator2.result)

class Calculator3() {
    var result: Int = 0

    fun calcualte(operaters: List<Char>, inputNumbers: List<Int>) {
        operaters.forEachIndexed { index, operater ->
            this.calculation(operater, value[index])
        }
    }

    fun calculation(symbol: Char, value: Int){
        if(symbol == '+'){
            result += value
        }
        else if(symbol == '-'){
            result -= value
        }
        else if(symbol == '*'){
            result *= value
        }
        else if(symbol == '/'){
            result /= value
        }
        else println("잘못된 연산 입니다")
    }
}

val calculator3 = Calculator3()
calculator3.calcualte(listOf<Char>('+', '-'), listOf<Int>(20, 10))
println(calculator3.result)