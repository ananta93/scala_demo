package com.ananta.demo

object AnonymousObjectTest {
  def AnonymousFunctionAdd(a:Int, b:Int):Int = {
    a+b
  }
  def main(args: Array[String]): Unit = {
    var resultObject:Int = AnonymousObjectTest.AnonymousFunctionAdd(10, 20);
    print("Result from anonymous object : "+resultObject)
  }
}
