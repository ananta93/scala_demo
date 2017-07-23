
package com.ananta.demo

class SingletonScalaTest{                                      //companion class
  print("Enter the value for a singleton companion int : ");
  private var singletonInt:Int=readInt()
  
  def show(){
    println("The private value inside singleton companion class : "+singletonInt);
  }
}

object myString{                                              // Singleton object
  
  print("Enter your name : ")
  private var singletonString:String=readLine()
 
  def display(){
    println("For singleton object your name is : "+singletonString)
  }
}

object SingletonScalaTest {
  def main(args: Array[String]): Unit = {
     
    new SingletonScalaTest().show() // calling to companion class
    println("This is inside companion Object")
    myString.display()  // No need to create the object
  }
}