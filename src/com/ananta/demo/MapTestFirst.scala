package com.ananta.demo

object MapTestFirst {
  def main(args: Array[String]): Unit = {
    var marks = Map("Ananta"->95, "Amit" ->88)
        println(marks("Ananta"))
        
    marks +=("Abhisek" ->98)
    for((k,v) <- marks)
      printf("key : %s , value : %s \n",k,v)
   
    marks -= "Amit"
    
    for((k,v) <- marks)
      printf("Key : %s , Value : %s \n",k,v)
  }
}