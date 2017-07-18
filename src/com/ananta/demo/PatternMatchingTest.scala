

package com.ananta.demo

object PatternMatchingTest {
  
  def find(x:Any):Any = x match{
    case "add" => "Addition"
    case 2 => "Hello"
    case true => 1
    case _ => "Invalid"
  }
  
  def main(args: Array[String]): Unit = {
    print("please select a number between 1 and 4 : ")
    var i:Int=3
    i match {
      case 1 => println(i+" is selected")
      case 2 => println(i+" is selected")
      case 3 => println(i+" is selected")
      case 4 => println(i+" is selected")
      case _ => println("Invalid selection ! Please try again")
    }
    println(find("add"))
    println(find(true))
    println(find("default_case"))
  }
}