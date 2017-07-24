package com.ananta.demo

class SecondaryEmployee(id:Int,name:String){
  var sal:Int=0
  def display(){
    println("Employee ID is : "+id)
    println("Employee name is : "+name)
    println("Employee salary is : "+sal)
  }
  def this(id:Int,name:String,sal:Int){
    this(id,name)
    this.sal=sal
  }
}

object SecondaryConsTest {
  def main(args: Array[String]): Unit = {
    var secondaryEmp=new SecondaryEmployee(7,"Ananta",10000)
    secondaryEmp.display()
  }
}