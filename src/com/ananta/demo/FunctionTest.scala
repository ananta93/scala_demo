package com.ananta.demo

object FunctionTest {
  def functionWithoutParam(){
    println("Function Without paramater called")
  }
  def functionWithParam(a:Int){
    println("Function with parameter called : "+a)
  }
  def functionWithAssignment()={
    print("Function with assignment : ")
    var b = 20
    b
  }
  
  //Function with recursion
  def recursiveFunction(c:Int):Int={
    if (c==0)
      1
    else
      c*(recursiveFunction(c-1))  
  }
  
  //default argument
  def functionDefaultArgument(m:Int, n:Int=10,p:Int=15):Int={ // default argument should be assigned to parameter at the end
   (m+n-p)
  }
  //Named argument
  def functionNamedArgument(lName:String,fName:String){
    println("Full name from Named parameter : "+fName+" "+lName)
  }
  def main(args: Array[String]): Unit = {
    functionWithoutParam()
    functionWithParam(10)
    var resultFromFunction = functionWithAssignment()
    println(resultFromFunction)
    var resultFromRecursive=recursiveFunction(5)
    println("Factorial from recursive function : "+resultFromRecursive)
    var resultDefault=functionDefaultArgument(20,20)
    println("Addition from default argument : "+resultDefault)
    functionNamedArgument(fName="Ananta", lName="Das")
  }
}