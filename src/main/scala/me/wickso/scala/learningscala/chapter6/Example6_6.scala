package me.wickso.scala.learningscala.chapter6

object Example6_6 {
  def main(args: Array[String]): Unit = {
    println(partitionPalindrome1(List("ab", "abc", "aba", "131", "s")))
    println(partitionPalindrome2(List("ab", "abc", "aba", "131", "s")))
  }

  def partitionPalindrome1(arr: List[String]): (List[String], List[String]) = {
    arr.partition(isPalindrome)
  }

  def partitionPalindrome2(arr: List[String]): (List[String], List[String]) = {
    (arr filter isPalindrome, arr.filter(!isPalindrome(_)))
  }

  def isPalindrome(str: String): Boolean = {
    str == str.reverse
  }
}
