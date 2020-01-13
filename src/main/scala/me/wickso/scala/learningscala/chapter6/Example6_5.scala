package me.wickso.scala.learningscala.chapter6

object Example6_5 {
  def main(args: Array[String]): Unit = {
    println(reverse(List(1, 2, 3, 4, 5)))
  }

  def reverse[A](arr: List[A]): List[A] = arr.length match {
    case 0 => List()
    case _ => reverse(arr.tail) :+ arr.head
  }
}
