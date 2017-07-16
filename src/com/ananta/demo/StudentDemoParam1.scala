package com.ananta.demo

class StudentDemoParam1(n:String,a:Int,r:Int){
  var name:String=n
  var age:Int=a
  var roll:Int=r
  def show()={
    println("Name : "+name )
    println("age : "+age)
    println("roll : "+roll)
  }
}

object StudentDemoParam1 {
  def main(args: Array[String]): Unit = {
    var s=new StudentDemoParam1("Ananta Das",24,1)
    s.show()
  }
}