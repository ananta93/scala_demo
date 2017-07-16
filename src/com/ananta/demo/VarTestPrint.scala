package com.ananta.demo

object VarTestPrint {
  def main(args: Array[String]): Unit = {
    var myByteVar1: Byte = 1
    var myShortVar1: Short = 2
    var myIntVar1: Int = 7
    var myLongVar1: Long =88888888
    var myFloatVar1: Float = 5.5f
    var myDoubleVar1: Double = 7.1
    var myStringVar1: String = "\t My first string variable"
    var myCharVar1: Char='M'
    var myBooleanVar1: Boolean=false
    var myAnyVar1: Any=5
    println("My first byte variable with declaration is : " + myByteVar1)
    println("My first short variable with declaration is : " + myShortVar1)
    println("My first int variable with declaration is : " + myIntVar1)
    println("My first long variable with declaration is : "+myLongVar1)
    println("My first float variable with declaration is : " + myFloatVar1)
    println("My first Double variable with declaration is : " + myDoubleVar1)
    println("My first String variable with declaration is : " + myStringVar1)
    println("My first char variable with declaration is : "+myCharVar1);
    println("My first Boolean variable with declaration is : "+myBooleanVar1);
    println("My first Any variable variable with declaration is : "+myAnyVar1);
  }
}