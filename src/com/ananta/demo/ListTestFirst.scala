

package com.ananta.demo

object ListTestFirst {
  def main(args: Array[String]): Unit = {
    var a =List(10,20,30)
    
    var b = 40 :: 50 :: Nil
    for(temp <-a){
      println(temp)
    }
    println("==========")
    b.foreach {
      println(_)
    }
  }
}