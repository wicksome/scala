package me.wickso.scala.learningscala.chapter1

object Example1_6 {
  def main(args: Array[String]): Unit = {
    val Pattern = "(\\d{3})-(\\d{3})-(\\d{4})".r
    val input = "Frank,123 Main,925-555-1943,95122"

    input.split(",")
      .foreach {
        case Pattern(first, second, third) => println((first, second, third))
        case _ =>
      }
  }
}
