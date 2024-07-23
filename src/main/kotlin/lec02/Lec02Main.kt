package lec02

fun main() {

}

fun startsWithA1(str: String?): Boolean {  // java boolean -> null이 들어올 수 없음
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {  // java Boolean -> null이 들어올 수 있음
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
    // 코틀린에서는 null일 수 있는 변수에서 바로 method call 불가능
    // 그러나 문맥 상 위에서 null을 체크하면 이후에 null이 아닐것이라고 컴파일러가 추측
}