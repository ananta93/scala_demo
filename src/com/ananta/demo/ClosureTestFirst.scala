

package com.ananta.demo

object ClosureTestFirst {
  def main(args: Array[String]): Unit = {
    var y:Int =12
    val a=(x:Int)=> x*y
    println(a(10))
  }
}