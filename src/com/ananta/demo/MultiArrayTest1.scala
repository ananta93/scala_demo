

package com.ananta.demo

object MultiArrayTest1 {
  def main(args: Array[String]): Unit = {
    var dArray =Array.ofDim[Int](2, 2)
    dArray(0)(0)=12
    dArray(0)(1)=13
    dArray(1)(0)=14
    dArray(1)(1)=15
    for(i<-0 to 1; j<-0 to 2){
      println(i,j)
    }
  }
}