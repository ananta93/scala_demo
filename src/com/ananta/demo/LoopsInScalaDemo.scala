

package com.ananta.demo

object LoopsInScalaDemo {
  def main(args: Array[String]): Unit = {
    var i:Int = 1
    //while loop
    println("For while loop")
    while(i<5){
      println(i)
      i=i+1
    }
    
    //do-while
    println("For do-while loop")
    do{
      println(i)
      i=i-1
    }while(i>1)
      
    //for loop
      println("For loop")
      for(i <- 1 to 5){ // val i:Int=1
        println(i)        
      }
     println("For loop")
      for(i <- 1 until 5){ // val i:Int=1
        print(i+" ")        
      }    
  }
}