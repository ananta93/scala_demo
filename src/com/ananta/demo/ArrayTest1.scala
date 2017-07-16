

package com.ananta.demo

object ArrayTest1 {
  def main(args: Array[String]): Unit = {
    var myIntArray:Array[Int] = new Array[Int](3)
    myIntArray(0)=2
    myIntArray(1)=4
    myIntArray(2)=6
    for(i<- 0 to 2){
      println(myIntArray(i))
    }
    println("For each");
    for(temp <- myIntArray){
      println(temp)
    }
  }
}