package org.example.test5

class User1(val name: String, val age: Int)

data class User2(val name: String, val age: Int){
    //data 는 데이터만 추상화 시키는 클래스를 위해 사용이 되지만 원한다면..
    //클래스 바디에.. 멤버 변수 함수 추가 가능하기는 하다..
    var email: String? = null
    constructor(name: String, age: Int, email: String): this(name, age){
        this.email = email
    }
}

fun main() {
    val obj1 = User1("kim", 10)
    val obj2 = User1("kim", 10)

    val obj3 = User2("kim", 10)
    val obj4 = User2("kim", 10)

    //false, true, false
    println("${obj1.equals(obj2)}, ${obj3.equals(obj4)}, ${obj1.equals(obj3)}")
    //true, false
    println("${obj3 == obj4}, ${obj3 === obj4}")

    val obj5 = User2("kim", 10, "a@a.com")
    val obj6 = User2("kim", 10, "b@b.com")
    //data 클래스는 body에 멤버 변수 추가 가능하지만 주 생성자의 멤버만 보고 움직인다..
    println("${obj5.equals(obj6)}")//true

    println(obj1)//org.example.test5.User1@4dd8dc3
    println(obj5)//User2(name=kim, age=10)

    //destructing assignment
    val data1 = obj3.component1()
    val data2 = obj3.component2()
    println("$data1, $data2")//kim, 10

    val (data3, data4) = obj3
    println("$data3, $data4")//kim, 10
}