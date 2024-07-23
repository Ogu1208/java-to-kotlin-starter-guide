package lec02

import com.lannstark.lec02.Person

fun main() {
    val person = Person(null)
    startsWithA(person.name)  // 공부하는 개발자
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}