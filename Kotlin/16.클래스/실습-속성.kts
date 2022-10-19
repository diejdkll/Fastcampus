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

