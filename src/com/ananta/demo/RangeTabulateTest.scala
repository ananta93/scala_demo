package com.ananta.demo

object RangeTabulateTest {
  def main(args: Array[String]): Unit = {
    var a = List.range(1, 10, 2)
    var b = List.tabulate(10)(b => b*b)
    var c = List.fill(5)(12)
    
    var d = a :::b ::: c
    
    a.foreach { println}
    println("=============")
    b.foreach { println }
    println("===========")
    c.foreach { println }
    println("===========")
    d.foreach { println }
  }
}