package me.wickso.scala.learningscala.chapter3

object Example3_1 {
  def main(args: Array[String]): Unit = {
    val result = (str: String) => str.length match {
      case 0 => "n/a"
      case _ => str
    }
    println(result(""))
    println(result("text"))
  }
}
