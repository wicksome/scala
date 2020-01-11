package me.wickso.scala.learningscala.chapter1

object Example1_1 {
  def main(args: Array[String]): Unit = {
    println(convertFahrenheitToCelsius(32))
    println(convertCelsiusToFahrenheit(100))
  }

  // 화씨 -> 섭씨
  def convertFahrenheitToCelsius(fahrenheit: Int): Int = {
    val celsius = (fahrenheit - 32) / 1.8
    celsius.toInt
  }

  // 섭씨 -> 화씨
  def convertCelsiusToFahrenheit(celsius: Int): Int = {
    val fahrenheit = (celsius * 9 / 5) + 32
    fahrenheit.toInt
  }
}
