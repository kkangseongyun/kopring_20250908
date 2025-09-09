package org.example.test4

//주 생성자
//주 생성자에 한해서 매개변수를 클래스 멤버변수로 선언이 가능하다. val, var 추가로..
class User(val name: String, val age: Int){
    init {
        println("$name, $age")
    }
    fun someFun(){
        println("$name, $age")
    }
}

//보조생성자만 선언가능.. 여러개 가능..
//만약 주 생성자를 추가했다면.. 보조 생성자로 객체가 생성될때 주 생성자는 무조건 실행되게 해야 한다.
//==>생성자가 필요하다면 주 생성자 위주로.. 여러개 선언이 필요하다면 보조 생성자 추가..
class User2(name: String) {
    //this(), super() 등 다른 생성자 호출 구문은 생성자 초기화 영역에..
    constructor(name: String, age: Int): this(name)
    //보조 생성자가 여러개라면.. 다른 보조 생성자를 호출할 수도 있다.
    //무조건.. 이 생성자에 의해 객체 생성시점에 주 생성자만 호출되면 된다..
    constructor(name: String, age: Int, email: String): this(name, age)
}

class User3 {
    var data1: String
    lateinit var data2: String

    //실행 시점에 초기화 시점을 미루기 위한 기법..
    //미리 초기화 될 필요 없는 경우.. 최초로 이용되는 순간 초기화 되는 경우...
    val data3: String by lazy {
        println("by lazy......")
        "hello"
    }

    init {
        data1 = "hello"
    }
}

fun main() {
    val user = User3()
    println("before data3....")
    println("data3 : ${user.data3}")
    println("after data3....")
}



