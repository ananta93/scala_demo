package com.ananta.demo
class Base{
  def show(){
    println("Inside base class")
  }
}
class Derived extends Base{
  override def show(){
    println("Inside derived class")
  }
}
object MethodOverridingTest {
  def main(args: Array[String]): Unit = {
    var derivedObject=new Derived()
    derivedObject.show()
  }
}