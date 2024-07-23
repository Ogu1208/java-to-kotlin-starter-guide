package com.lannstark.lec02;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {

  private final String name;

  public Person(String name) {
    this.name = name;
  }

//  @Nullable  // 에러
//  @NotNull  // 에러 발생 X
  public String getName() {
    return name;
  }

}


