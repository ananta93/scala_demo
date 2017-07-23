

package com.ananta.demo

object NamedArgument {
  def main(args: Array[String]): Unit = {
    printName(fName="Ananta",lName="Das")
    printNameSwap(fName="Ananta", lName="Das")
  }
  def printName(fName:String,lName:String){
    println("Name : "+fName+" "+lName)
  }
  def printNameSwap(lName:String,fName:String){
    println("Full Name : "+lName+" "+fName)
  }
}