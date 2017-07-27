package com.ananta.demo

class ExceptionHandler {

  def devideByZero(a: Int, b: Int) {
    try {
      a / b
    } catch {
      case t: ArithmeticException => println(t)
      case anyException: Throwable => println("Any type of exception can be handled")
    }
    finally{ // finally block will be executed
      println("Finally block will be executed anyway")
    }
    println("Executed code after exception caught ")
  }
}
class ExceptionHandlerThrows{ // handling the exception through throws keyword
  @throws(classOf[ArrayIndexOutOfBoundsException])  
  def ArraySizeExceeded(a:Array[Int]){
    a(2)=10
    a(5)=15
    for (temp <- a){
      println(temp)
    }
  }
}
object ExceptionTestFirst {
  def main(args: Array[String]): Unit = {
    var exceptionObj = new ExceptionHandler
    exceptionObj.devideByZero(10, 0)
    var arrayThrows = Array(1,2,3,4)
    var throwsObj = new ExceptionHandlerThrows
    try{
      throwsObj.ArraySizeExceeded(arrayThrows)
    }catch{
      case t:ArrayIndexOutOfBoundsException =>println("Array size exceeded")
    }
  }
}