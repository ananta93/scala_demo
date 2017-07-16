

package com.ananta.demo

object ExceptionTestFirst {
  def main(args: Array[String]): Unit = {
    var a:Int =10
    var b:Int =0
    try {
      a/b
    } catch {
      case t: ArithmeticException => println("Exception is generated ")
    }
  }
}