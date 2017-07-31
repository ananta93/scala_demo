package com.ananta.demo

object TupleTestFirst {

  def multiTupleReturn() = {
    var multiTuple = (4, 7.2, "Aishwarya")
    multiTuple
  }
  def main(args: Array[String]): Unit = {
    var emptyTuple=()
    var intTuple=(1,2,3,4,5)
    var stringTuple=("Ananta","Amit","Abhisek")
    var mixedTuple=("Ananta",7,7.5)
    println("Empty tuple : "+emptyTuple)
    println("The first element of the tuple : "+intTuple._1)
    println("Is the student name Ananta? "+stringTuple.productIterator.contains("Ananta"))
    println("The elements in the tuple are : ")
    mixedTuple.productIterator.foreach(println)
    
    var multiReturnResult = multiTupleReturn()
    println("Multiple values returned from a function : ")
    multiReturnResult.productIterator.foreach { println }
  }
}