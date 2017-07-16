

package com.ananta.demo

object PatternMatchingTest {
  
  def find(x:Any):Any = x match{
    case "add" => "Addition"
    case 2 => "Hello"
    case true => 1
    case _ => println("Invalid")
  }
  
  def main(args: Array[String]): Unit = {
    print("please select a number between 1 and 4 : ")
    var i:Int=readInt()
    i match {
      case 1 => println(i+" is selected")
      case 2 => println(i+" is selected")
      case 3 => println(i+" is selected")
      case 4 => println(i+" is selected")
      case _ => println("Invalid selection ! Please try again");
    }
//    var j:Any=readLine()
    println(find(readLine()))
    println(find(readInt()))
  }
}