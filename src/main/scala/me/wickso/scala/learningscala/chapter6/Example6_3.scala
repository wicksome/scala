package me.wickso.scala.learningscala.chapter6

import scala.annotation.tailrec

object Example6_3 {
  def main(args: Array[String]): Unit = {
    val items = List('a', 't', 'o')
    val count = 2

    println(first1(items, count))
    println(first2(items, count))
    println(first3(items, count))
    println(first4(items, count))
  }

  def first1[A](items: List[A], count: Int): List[A] = {
    items.take(count)
  }

  def first2[A](items: List[A], count: Int): List[A] = {
    var result = List[A]()
    items.foreach(item => if (result.length < count) result = result :+ item)
    result
  }

  def first3[A](items: List[A], count: Int): List[A] = {
    items.foldLeft(List[A]()) {
      (arr, item) => {
        if (arr.length < count) arr :+ item else arr
      }
    }
  }

  def first4[A](items: List[A], count: Int): List[A] = {
    if (count == 0) List[A]()
    else items.head :: first4(items.tail, count - 1)
  }
}
