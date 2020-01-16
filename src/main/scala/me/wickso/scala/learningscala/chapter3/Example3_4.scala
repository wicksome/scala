package me.wickso.scala.learningscala.chapter3

object Example3_4 {
  def main(args: Array[String]): Unit = {
    // case 1
    (1 to 100).foreach(number => if (number % 5 == 0) println(number) else print(number + ", "));
    // case 2
    for (i <- 1 to 100 by 5) {
      for (j <- i to (i + 4)) print(s"$j, ")
      println()
    }
  }
}
