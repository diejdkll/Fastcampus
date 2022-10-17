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
val user = User1("홍길동")


