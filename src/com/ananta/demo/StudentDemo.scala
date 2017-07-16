
package com.ananta.demo

class StudentDemo {
  var name: String = "Ananta"
  var age: Int = 0
  var rollNo: Int = 0

  def show() = {
    println("Name " + name)
    println("Age " + age)
    println("Roll No." + rollNo)
  }
}

object StudentDemo {

  def main(args: Array[String]){
    var s = new StudentDemo
    s.show()
  }
}