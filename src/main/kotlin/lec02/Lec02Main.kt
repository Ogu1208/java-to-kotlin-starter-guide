package lec02

fun main() {
    println(startsWith5("ABC"))  // true
    println(startsWith5("BC"))  // false
    println(startsWith5(null))  // Runtime에서 NullPointerException 발생
}

fun startsWithA1(str: String?): Boolean {  // java boolean -> null이 들어올 수 없음
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("str is null")
    // 앞이 null일 경우 전체가 null이 되면서 ?: 뒤의 Exception 발생
}

fun startsWithA2(str: String?): Boolean? {  // java Boolean -> null이 들어올 수 있음
    return str?.startsWith("A")
    // Safe Call은 앞에 변수가 null 그대로 null이 된다.
    // 앞 (str)이 null일 경우 전체가 null이 되면서 그대로 null 반환
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
    // 앞(str)이 null일 경우 전체가 null이 되면서 ?: 뒤의 false 반환

}

fun startsWithA4(str: String): Boolean {  // String, Boolean 모두 Null X
    return str.startsWith("A")
}

fun startsWith5(str: String?): Boolean {
    return str!!.startsWith("A")
    // !! : null이 아님을 보장하는 연산자
}