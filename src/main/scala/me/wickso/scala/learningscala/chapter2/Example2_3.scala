package me.wickso.scala.learningscala.chapter2

import scala.math.round

object Example2_3 {
  def main(args: Array[String]): Unit = {
    val input = 2.7255
    println(s"You owe $$${round(input * 100) / 100.0}.")
  }
}
