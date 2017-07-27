package com.ananta.demo

class OutOfRangeException(s:String) extends Exception(s){}

class ExceptionValidation{
  @throws(classOf[OutOfRangeException])
  def check(a:Int){
    if(a>50){
      throw new OutOfRangeException("limit exceeded")
    }
    else{
      println("You are in the limit")
    }
  }
}
object CustomExceptionTest {
  def main(args: Array[String]): Unit = {
    var customExObj = new ExceptionValidation
    try{
      customExObj.check(60)
    }catch {
      case t: Throwable => println("Exception occurred : "+t)
    }
  }
}