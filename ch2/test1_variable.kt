package org.example.test1

import kotlin.random.Random
import kotlin.random.nextInt


//top level, class member 변수는 선언과 동시에 초기화 해야 한다. 자동 초기화 해주지 않는다...
val data1: Int = 10
var data2: Int = 20

class MyClass {
    val data3: Int = 10
    var data4: Int = 20

    fun someFun() {
        //지역 변수는 선언과 동시에 초기화 하지 않아도 된다..
        //이용(연산)하기전에 꼭 초기화는 되어 있어야 한다..
        val data5: Int
        var data6: Int

        data5 = 10
        data6 = 20

        val result = data5 + data6
    }
}

//val은 상수는 아니다.. 값 변경이 불가능하지만.. 이용할때 동일 값이 나온다고 보장할 수는 없다..
//코틀린의 변수는 프로퍼티이다.. accessor(getter/setter)를 내장한 변수이다..
//custom accessor 를 이용하면 동일 값이 아닐 수 있다..
//val valData = 10
val valData: Int
    get() {
        return Random.nextInt(0, 100)
    }

fun main() {
    println("hello")
    println(valData)
//    valData = 20//error
    println(valData)

    val data1 = 10
    //Int <-> Double 등 기초 타입 캐스팅 지원안된다.. 모두 객체이기 때문이다..
    //상 하위 관계가 없다..
    //함수를 이용...
    val data2: Double = data1.toDouble()
}