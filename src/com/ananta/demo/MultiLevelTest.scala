package com.ananta.demo

class A{
  var a:Int =10
}

class B extends A{
  var b:Int=20
}

class C extends B{
  var sum : Int = 0
  def display(){
    println("The value of a : "+a)
    println("The value of b : "+b)
    println("The addition of two variables from parents : "+(sum+a+b))
  }
}

object MultiLevelTest {
  def main(args: Array[String]): Unit = {
    var multiLevelObject = new C()
    multiLevelObject.display()
  }
}