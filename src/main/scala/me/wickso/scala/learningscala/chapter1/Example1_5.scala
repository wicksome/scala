package me.wickso.scala.learningscala.chapter1

object Example1_5 {
  def main(args: Array[String]): Unit = {
    val num: Int = 128
    println(num)

    val char = num.toChar
    println(char)

    val string = char.toString
    println(string)

    val double = string.charAt(0).toDouble
    println(double)

    val int = double.toInt
    println(int)
  }
}
