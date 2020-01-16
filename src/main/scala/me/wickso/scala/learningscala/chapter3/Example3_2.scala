package me.wickso.scala.learningscala.chapter3

object Example3_2 {
  def main(args: Array[String]): Unit = {
    val amount: Double = -1
    println(convert1(amount))
    println(convert2(amount))
    println(convert3(amount))
  }

  def convert1(amount: Double): String = {
    if (amount > 0) "greater" else if (amount < 0) "less" else "same"
  }

  def convert2(amount: Double): String = amount match {
    case x if x > 0 => "greater"
    case x if x < 0 => "less"
    case x if x == 0 => "same"
  }

  def convert3(amount: Double): String = amount compare 0 match {
    case -1 => "less"
    case 0 => "same"
    case 1 => "greater"
  }
}
