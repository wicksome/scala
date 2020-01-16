package me.wickso.scala.learningscala.chapter3

object Example3_3 {

  def main(args: Array[String]): Unit = {
    println(convert("cyan"))
    println(convert("magenta"))
    println(convert("yellow"))
    println(convert("red"))
  }

  def convert(color: String): Array[Char] = color match {
    case "cyan" => color.toCharArray
    case "magenta" => color.toCharArray
    case "red" => color.toCharArray
    case _ => throw new IllegalArgumentException("invalid parameter")
  }
}
