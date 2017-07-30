package com.ananta.demo

object SequenceTestFirst {
  def main(args: Array[String]): Unit = {
    var seq1:Seq[Int]=Seq(22,34,45,67,87,76,65)
    seq1.foreach { seqElement => print(seqElement+" ") }
    println("\nElement present at 5th index : "+seq1(5))
    println("Does the sequence contain 20 ? "+seq1.contains(20))
    println("Reversing the sequence : "+seq1.reverse)
    println("Is the sequence empty? "+seq1.isEmpty)
    println("Does the sequence end with 65? "+seq1.endsWith(Seq(65)))
    println("The first element of the sequence is : "+seq1.head)
  }
}