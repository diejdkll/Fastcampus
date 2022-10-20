// getter/setter
class Book() {
    var title: String = "모름"
        get() {
            println("getter")
            return field
        }
        set(value) {
            println("setter")
            field = value
        }
}

val book = Book()
println(book.title)
book.title = "제목변경"
println(book.title)

// lateinit
class MasterBook() {
    lateinit var title: String

    fun nextPage() {
        if (::title.isInitialized == true) {
            println("페이지가 넘어간다")
        } else {
            println("초기화 필요")
        }
    }
}

val book2 = MasterBook() // MasterBook -> 거푸집 book -> 객체, 쩍어낸거
book2.title = "책이름"
println(book2.nextPage())

// Lazy
// - 호출시점에 lazy 정의에 의해서 초기화 수행
// - val에서만 사용가능
class Book2 {
    val title: String by lazy {
        // 본문 -> 다른 작업도 할 수 있지만 반드시 프로퍼티를 초기화 시켜주는 작업을 해야한다
        println("lazy 초기화") // 다른
//        title = "책 제목" -> x
//        return "책 제목" -> x
        "책 제목"
    }
}

val book3 = Book2()
println(book3.title)