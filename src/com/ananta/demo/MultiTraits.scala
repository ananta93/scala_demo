
package com.ananta.demo/**
 * @author Ananta
 */
trait OneMulti {
  var x:Int //abstract field
  var y:Int =12 //concrete field
  
  def fun()
}
trait TwoMulti{
  def show()
}
class ThreeMulti extends OneMulti with TwoMulti{
  println("Enter the value for the abstract field : ")
  var x= readInt()
  def fun(){
    println("Trait one method")
  }
  def show(){
    println("Trait two method")
  }
}

object MultiTraits {
  def main(args: Array[String]): Unit = {
    var ob:ThreeMulti=new ThreeMulti
    ob.fun()
    ob.show()
  }
}