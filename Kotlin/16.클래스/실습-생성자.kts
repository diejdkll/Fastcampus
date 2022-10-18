//클래스를 선언하는 방법
class Person {}

// 생성자
// - 주생성자
//  - 클래스 이름 옆에 괄호로 둘러싸인 코드
//  - 클래스를 통해서 객체를 만드는데 필요한 재료들을 적어 준다
//      - 재료이름(변수명): 재료타입(변수타입)
//  - 반드시 한개만 존재할 수 있다
//  - constructor 키워드를 생략가능

// 주생성자 -> 풀버전 (생략이 없는 버전)
class User1 constructor(name: String) { // 클래스 네이밍은 대문자로 시작한다
    val userName: String // 클래스 속성(프로퍼티, proprety)은 init블럭에서 초기화 된다

    init { // 클래스가 생성될때(클래스를 통해서 객체를 만들때) 호출된다
        println(name)
        userName = name
    }
}

// 클래스를 호출하는 방법 -> 클래스를 통해서 객체를 만드는 방법
// 클래스를 호출 -> 인스턴스화 (Instance)
// 객체 -> Object, Instance

// 주생성자 -> init을 생략하는 방법
class User2 constructor(name: String) {
    val userName: String = name
}

// 주생성자 -> constructor을 생략하는 방법
class User3(name: String) {
    val userName: String = name
}

// 주생성자 -> 생략할 수 있는 모든걸 생략하는 방법
class User4(val name: String)

// 주생성자 -> 기본값
class User5(name: String = "김아무개") {
    val userName: String = name
}

// 생성자에서 받는 속성이 여러 개인 경우
class User6(age: Int, name: String) {
    val age: Int
    val name: String

    init {
        this.age = age // this는 클래스 자체를 의미한다(User6) -> User6의 age
        this.name = name
    }
}
// .의 의미
// -> ~의
val user6 = User6(20, "홍길동")
println(user6.age)
// - user6.age -> user6의 age
// - user6.name -> user6의 name
// - user6.기능 -> user6의 기능
// -> .은 객체의 속성이나 기능을 사용할때 사용

// 부생성자 (Seceondary Constructor)
// - constructor 키워드를 생략할 수 없다
// - 주생성자에는 객체를 만들기 위한 필수 조건이 있다면, 부생성자에는 객체를 만들기 위한 옵션 조건이 있다
// - 부생성자에는 주생성자에서 필요한 조건을 포함하고 있어야 한다 (파라미터를 포함하고 있어야 한다)
// - 부생성자는 주생성자에게 생성을 위임해야 한다
class User7 constructor(name: String) {
    var age: Int = 0
    val name: String

    init {
        this.name = name
    }

    // 부생성자는 클래스명 우측에 올 수 없다 -> 클래스의 본문에 있어야 한다
    constructor(name: String, age: Int) :this(name) {
        this.age = age
    }
}

val user7 = User7("가나다")
println(user7.name)
val user7_2 = User7("가나다다", 50)
println(user7_2.age)

