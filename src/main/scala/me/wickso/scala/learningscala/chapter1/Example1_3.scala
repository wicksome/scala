package me.wickso.scala.learningscala.chapter1

import math.round

object Example1_3 {
  def main(args: Array[String]): Unit = {
    val input = 2.7255
    println(s"You owe $$${round(input * 100) / 100.0}.")
  }
}
