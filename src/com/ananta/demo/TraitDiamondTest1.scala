package com.ananta.demo

trait OneMultiFirst{
  def show(){
    println("One show function")
  }
}
trait TwoMultiFirst extends OneMultiFirst{
  override def show(){
    println("Two show function")
  }
}
trait ThreeMultiFirst extends OneMultiFirst{
  override def show(){
    println("Three show function")
  }
}
class FourMultiFirst extends ThreeMultiFirst with TwoMultiFirst

object TraitDiamondTest1 {
 def main(args: Array[String]): Unit = {
   var ob:FourMultiFirst=new FourMultiFirst
    ob.show()
 } 
}