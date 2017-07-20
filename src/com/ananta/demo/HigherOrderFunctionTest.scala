package com.ananta.demo

object HigherOrderFunctionTest {  
  
  def functionAsParam(a:Int , f:Int=>Any):Unit={
    println("Passing a Function as Parameter in a Function : "+f(a))
  }
  
  def funCompositionAdd(a:Int):Int={
    a+10
  }
  
  def multiplyBy2(a:Int):Int={
    a*2
  }
  
  def funAnonymous(){
    var resultRocket = (a:Int, b:Int) =>a+b
    var resultUnderScore = (_:Int)+(_:Int)
    println("Anonymous function by using Rocket : "+resultRocket(10,20))
    println("Anonymous function by using _ : "+resultUnderScore(20,30))
  }
  
  def funCurryingAdd(a:Int)(b:Int):Int={
    (a+b)
  }
  
  def funNestedAdd(a:Int, b:Int, c: Int):Int = {
    def innerFunction(x:Int, y:Int):Int = {
      x+y
    }
    innerFunction(a, innerFunction(b, c))
  }

  def funVariableLength(args:Int*):Int = {
    var sum = 0
    for(i <- args) sum+=i
    sum
  }
  def main(args: Array[String]): Unit = {
    
    functionAsParam(25, multiplyBy2)                         //function as parameter
    
    var resultComposition=funCompositionAdd(multiplyBy2(10)) //function composition
    println("Function composition add : "+resultComposition) 
    
    funAnonymous()                                           // anonymous function
    
    var funCurryingSingleArg = funCurryingAdd(10)_           //function currying
    var resultCurrying = funCurryingSingleArg(5)  
    println("Function Currying : "+ resultCurrying)
    
    var resultNested = funNestedAdd(10, 20, 30)             //Nested function
    println("Nested function add : "+resultNested)
    
    var resultVarLength = funVariableLength(1,2,3,4,5,6,7,8,9) //Function with variable args
    println("Function variable length sum : "+resultVarLength) 
  }
}
