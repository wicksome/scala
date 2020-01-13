package me.wickso.scala.learningscala.chapter6

import java.util.stream.{Collectors, IntStream}

object Example6_1 {
  def main(args: Array[String]): Unit = {
    val arr1 = LazyList.from(1)
      .filter(i => i % 2 == 1)
      .take(20)
      .toList
    println(arr1)
    println(arr1.length)

    val arr2 = LazyList.from(1, 2)
      .take(20)
      .toList
    println(arr2)
    println(arr2.length)
  }
}
