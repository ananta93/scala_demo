
package com.ananta.demo

class StudentDemo {
  var name: String = "Ananta"    // state of an object
  var age: Int = 0
  var rollNo: Int = 0

  def show() = {                //Behavior of an object  
    println("Name : " + name)
    println("Age : " + age)
    println("Roll No. : " + rollNo)
  }
}

object StudentDemo {

  def main(args: Array[String]){
    var s = new StudentDemo     //Creation of object
    s.show()     //Accessing members through reference variable
  }
}