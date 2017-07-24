package com.ananta.demo

class Employee(fName:String, lName:String){  //primary constructor call
  def display(){
    println("The name of the employee is : "+fName+" "+lName);
  }
}

object PrimaryConstructorTest {
  def main(args: Array[String]): Unit = {
    var primaryEmployee=new Employee("Ananta", "Das")
    primaryEmployee.display()
  }
}