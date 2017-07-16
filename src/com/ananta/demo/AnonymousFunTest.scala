

package com.ananta.demo

object AnonymousFunTest {
  def main(args: Array[String]): Unit = {
    var f=()=>println("Anonymous function")
    f()
    var sum=(x:Int,y:Int)=>x+y
    println("Value : "+sum(2,3))
  }
}