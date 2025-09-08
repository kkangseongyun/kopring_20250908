package org.example.test2

var data1: String = "kim"
var data2: String? = "kim"

fun main() {
//    data1 = null//error...
    data2 = null

    //타입적으로 nullable 이 non-null의 상위타입이다..
    var data3: String? = data1 //non-null => nullable 암시적 캐스팅...
    //문법에는 문제가 없지만 런타임 시점에 data2에 실제 null이 대입되어 있다면..
    //as? - null 이 아닌 경우에만 캐스팅 시도하라..
    var data4: String = data2 as? String ?: "" //nullable -> non-null

    //nullable 객체의 멤버 접근은 ?.
    var result: Int = data2?.length ?: 0
}