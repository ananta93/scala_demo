package com.ananta.demo

class EmployeeOverloaded(id:Int){
  
  def this(id:Int, name:String){
    this(id)
    println("Inside secondary constructor id is : "+id+" name is "+name)
  }
  println("Inside primary constructor id is : "+id)
}

object ConstOverloadingTest {
  def main(args: Array[String]): Unit = {
    new EmployeeOverloaded(4)
    new EmployeeOverloaded(7,"Ananta")//constructor overloading
  }
}