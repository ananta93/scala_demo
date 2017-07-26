package com.ananta.demo

class StringImmutable{
  var str1:String = "The first Scala string"
  str1+"test"
  var str2=str1+" is modified"
  def display(): Unit={
    println(str1)
  }  
  def show(){
    println(str2)
  }
}
object StringTestFirst {
  def main(args: Array[String]): Unit = {
    var stringObj = new StringImmutable()
    print("Unable to modify ")
    stringObj.display()
    print("Now this is a new string ")
    stringObj.show()
  }
}