
package com.ananta.demo

object myInt{//companion object
  print("Please enter a number : ")
  private var myIntVar:Int=readInt();
  def display(){
    var ob:myInt=new myInt
    println("The value inside singleton int variable is : "+ob.singletonInt)
  }
  
}
class myInt{//companion class
  import myInt._ 
  print("Enter the value for a singleton int : ");
  private var singletonInt:Int=readInt()
  def show(){
    println("The private value of singleton Int : "+myIntVar);
  }
}

object myString{
  
  println("Enter your name : ")
  private var singletonString:String=readLine()
  def display(){
    
    println("Your name is : "+singletonString)
  }
}

object SingletonScalaTest {
  def main(args: Array[String]): Unit = {
    var intObj:myInt=new myInt
    intObj.show()
    myInt.display()
//    myString.display()x
  }
}