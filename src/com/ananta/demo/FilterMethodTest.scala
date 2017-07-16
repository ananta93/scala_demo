package com.ananta.demo

object FilterMethodTest {
  def main(args: Array[String]): Unit = {
    var a = List.range(1, 100)
    
    var b = a.filter ( even )
    
    var c =a.filter { temp => temp%5==0 }
    b.foreach { println }
    c.foreach { println }
  }
  def even(x:Int):Boolean={
    if (x%2==0)
      return true
    else 
      return false
  }
}