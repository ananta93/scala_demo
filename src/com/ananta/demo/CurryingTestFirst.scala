// a function which takes the remaining parameter

package com.ananta.demo

object CurryingTestFirst {
  def add(a:Int,b:Int) = {a+b}
  def sum(x:Int) = {(y:Int) =>{x+y}}
  
  def main(args: Array[String]): Unit = {
    println("Result : "+add(10,20))
    println("Currying Result : "+sum(10)(25))
  }
}