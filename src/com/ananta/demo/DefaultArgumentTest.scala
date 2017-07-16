

package com.ananta.demo

object DefaultArgumentTest {
  def main(args: Array[String]): Unit = {
    fun("Ananta","Das")
    fun("Ananta")
    fun()
    fun2("Ananta","Chandra")
    
  }
  def fun(fName:String="Unknown", lName:String="Unknown"){
    println("Name : "+fName+" "+lName)
  }
   def fun2(fName:String="Unknown", lName:String){
    println("Name : "+fName+" "+lName)
  }
}