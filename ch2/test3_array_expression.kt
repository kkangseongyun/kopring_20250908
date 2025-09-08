package org.example.test3

fun main() {
    //배열 선언과 동시에 값 대입이 가능한 경우..
    val array1 = arrayOf<Int>(10, 20)
    //사이즈만 지정하고.. 실제 값은 나중에 대입..
    //{ 0 } - 람다함수다.. 람다함수내에서는 명시적으로 return 구문 사용 못한다..
    //람다 함수의 맨 마지막 실행 결과가 리턴 값이다..
    //단 inline 으로 선언된 함수에 대입되는 람다 함수에 한해서는 return 사용 가능..
    val array2 = Array<Int>(3, { 0 })

    //기초 타입에 한해 만든 배열 관련 API 는 자바 호환에 필요...
    intArrayOf(10, 20)
    IntArray(3, { 0 })

    //list, set, map...................
    val list1 = listOf<Int>(10, 20)//List
    println("${list1[0]}, ${list1.get(0)}")
//    list1.add(30)//error
//    list1.set(0, 0)//error

    val list2 = mutableListOf<Int>(10, 20)//MutableList
    println("${list2[0]}, ${list2.get(0)}")
    list2.add(30)
    list2.set(0, 0)

    //if expression
    val a = 5

    //expression 으로 사용하면 else 생략 불가..
    val result = if(a > 10) "hello"
    else {
        println("hhhh")
        "world"
    }



}