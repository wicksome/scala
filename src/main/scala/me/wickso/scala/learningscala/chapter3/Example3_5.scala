package me.wickso.scala.learningscala.chapter3

object Example3_5 {
  def main(args: Array[String]): Unit = {
    (1 to 100).map {
      case x if x % 3 == 0 && x % 5 == 0 => "typesafe"
      case x if x % 3 == 0 && x % 5 != 0 => "type"
      case x if x % 3 != 0 && x % 5 == 0 => "safe"
      case other => other
    } foreach (println)
  }
}
