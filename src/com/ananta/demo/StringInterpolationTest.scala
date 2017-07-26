package com.ananta.demo

class SInterpolationMethods(){
  var str1:String = "String inter polation with"
    def display(){
      println(s"$str1 'S' Method")
    }
}
class FInterpolationMethods(){
  var str2:String = "The Multiplication of "
  var a:Int=10
  var b:Int=20
  var mult: Double = a*b
  def display(){
    println(f"$str2%s $a%d and $b%d is : $mult%f")
  }
}
class RawInterpolationMethods(){
  var str3:String = "Escape \tsequence \nwithout raw method"
  var str4:String = raw"Escape \tsequence \nwith raw method"
    def display(){
      println(str3)
      println("====================================")
      println(str4)
    }
}
object StringInterpolationTest {
  def main(args: Array[String]): Unit = {
    var sMethodObject = new SInterpolationMethods
    sMethodObject.display()
    var fMethodObject = new FInterpolationMethods
    fMethodObject.display()
    var rawMethodObject = new RawInterpolationMethods
    rawMethodObject.display()
  }
}