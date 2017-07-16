

package com.ananta.demo

object HigherFunctionTest {
  def perform(f:(Int,Int)=>Int){
    println("The value is : "+f(10,20))
  }
  def main(args: Array[String]): Unit = {
    perform((x:Int,y:Int)=>x*y)
  }
}