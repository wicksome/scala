package me.wickso.scala.learningscala.chapter6

object Example6_2 {
  def main(args: Array[String]): Unit = {
    val arr = List(9, 11, 13, 15)
      .flatMap(factors)
    println(arr)
  }

  def factors(number: Int): List[Int] = {
    (2 until number)
      .filter(i => number % i == 0)
      .toList
  }
}
