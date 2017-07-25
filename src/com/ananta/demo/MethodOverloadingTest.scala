package com.ananta.demo

object MethodOverloadingTest {
  
  def area(a:Int, b:Int):Int={ //Method overloading with different return type
    a*b
  }
  
  def area(r:Double):Double={
    var x:Double = 3.141
    (2*x*r)
  }
  
  def main(args: Array[String]): Unit = {
    var areaRectange=area(10, 20)
    println("Area of the rectangle is : "+areaRectange)
    var areaCircle=area(5.5)
    println("Area of the circle is : "+areaCircle)
  }
}