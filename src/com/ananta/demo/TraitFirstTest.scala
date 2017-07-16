package com.ananta.demo/**
 * @author Ananta
 */
trait One {
  def show()
}
class Two extends One{
  def show(){
    print("Trait is called")
  }
}
object TraitFirstTest {
  def main(args: Array[String]): Unit = {
    var ob:Two=new Two
    ob.show()
  }
}