package me.wickso.scala.learningscala.chapter6

object Example6_4 {

  def main(args: Array[String]): Unit = {
    val str = getLongestString("a", "ab123", "b", "abc", "e22222")
    println(str)
  }

  def getLongestString(arr: String*): String = {
    arr.reduce((x, y) => if (x.length > y.length) x else y)
  }
}
