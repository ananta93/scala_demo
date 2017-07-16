package com.ananta.demo

import scala.collection.mutable.Map

object MutableMapTest {
  def main(args: Array[String]): Unit = {
    var marks = Map("Ananta" -> 95, "Amit" ->96)
    marks += ("Abhisek" ->91)
    
    for((k,v) <- marks)
      printf("Key : %s , Value : %s \n",k,v)
      
    marks("Ananta")=98
    println("============")
    for((k,v) <- marks)
      printf("Key : %s , Value : %s \n",k,v)
  }
}