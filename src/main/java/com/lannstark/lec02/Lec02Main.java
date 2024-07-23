package com.lannstark.lec02;

public class Lec02Main {

  public static void main(String[] args) {

  }

  // 1. str이 null일 경우 Exception을 낸다.
  public boolean startsWithA1(String str) {
    if (str == null) {
      throw new IllegalArgumentException("null이 들어왔습니다");
    }
    return str.startsWith("A");
  }

  // 2. Null 일 경우 null을 반환하고, 그 외에는 startsWith("A")를 반환한다.(true/false -> boolean 객체 타입)
  public Boolean startsWithA2(String str) {
    if (str == null) {
      return null;
    }
    return str.startsWith("A");
  }

  // 3. null알 경우 false를 반환
  public boolean startsWithA3(String str) {
    if (str == null) {
      return false;
    }
    return str.startsWith("A");
  }

}
