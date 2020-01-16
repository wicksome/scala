package me.wickso.scala.learningscala.chapter3

object Example3_6 {
  def main(args: Array[String]): Unit = {
    (1 to 100).foreach(i => {
      var str: String = ""; if (i % 3 == 0) str += "type"; if (i % 5 == 0) str += "safe"; if (str.isEmpty) str += i; println(str)
    })
  }
}
