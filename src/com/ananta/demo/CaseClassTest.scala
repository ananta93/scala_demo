package com.ananta.demo

case class CaseClassInput(fName:String,lName:String)

object CaseClassTest {
  def main(args: Array[String]): Unit = {
    var fullName = CaseClassInput("Ananta", "Das")  //creating object of case class
    println("The first name is : "+fullName.fName)
    println("The last name is : "+fullName.lName)
  }
}