package com.ananta.demo

object ListOperations {
  def main(args: Array[String]): Unit = {
    var list1 = List(2,4,3,1,5,8,7,6,9)
    var list2 = List(10,11,12,13,15)
    print("Elements in the first list : ")
    list1.foreach { listElement1:Int => print(listElement1+" ") }
    println("\nMerging two lists : "+(list1++list2))
    println("Sorted lists : "+list1.sorted)
    println("Reversing a list : "+list2.reverse)
  }
}