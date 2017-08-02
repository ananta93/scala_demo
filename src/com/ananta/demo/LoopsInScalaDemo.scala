package com.ananta.demo

object LoopsInScalaDemo {
  def main(args: Array[String]): Unit = {
      var i:Int = 1
     
      //while loop
      print("While loop : ")
      while(i<5){
        print(i+" ")
        i=i+1
      }
      
      //do-while
      print("\nDo-while loop : ")
      do{
        print(i+" ")
        i=i-1
      }while(i>1)
        
      //for loop to to
      print("\nFor loop to : ")
      for(i <- 1 to 5){ // val i:Int=1
        print(i+" ")        
      }
      
      //for loop until
      print("\nFor loop from : ")
      for(i <- 1 until 5){ // val i:Int=1
        print(i+" ")        
      }    
      
      //for loop filter
      print("\nFor loop filter : ")
      for(i<-1 to 10 if (i%2==0)){
        print(i+" ")
      }
      
      //for loop yield
      print("\nFor loop with yield  : ")
      var yieldResult = for(i<- 1 to 10) yield i
      for(a<-yieldResult){
        print(a+" ")
      }
      
      //for each loop
      print("\nFor each loop  : ")
      var list = List(10,20,30,40,50)
      list.foreach {(element)=>print(element+" ")} 
      
      //for loop by
      print("\nFor loop by  : ")
      for(i<-1 to 10 by 2){
        print(i+" ")
      }
  }
}
