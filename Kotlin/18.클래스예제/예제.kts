// 자료형
// -> Int, Byte, Short, Long ....
// -> Class도 자료형(타입)이 될 수 있다

class Bank {

    fun save(account: Account, money: Int) {
        if (money >= 0) account.balance += money
        else println("마이너스 금액은 예금할수 없습니다 ")
    }

    fun withdraw(account: Account, money: Int) {
        if (account.checkBalance() >= money) account.balance -= money
        else println("잔액이 부족 합니다")
    }
}
