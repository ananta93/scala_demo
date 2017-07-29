package com.ananta.demo

import scala.collection.immutable.Set
import scala.collection.immutable.SortedSet
import scala.collection.immutable.HashSet
import scala.collection.immutable.BitSet
import scala.collection.immutable.ListSet

object SetTestFirst {
  def main(args: Array[String]): Unit = {
    val set1 = Set()
    val set2 = Set("Ananta", "Amit", "Abhishek", "Amit", "Aishwarya")
    var set3 = Set("C++","Java","Scala","Python")
    var set4 = Set("HTML","CSS", "JavaScript")
    var set5 = Set(2,4,1,6,3,5)
    var set6 = Set(1,8,9,7,3)
    var set7 = Set(1,3,2,3,4,3)
    val sortedSet1 = SortedSet(2,4,1,6,3,5,1,8,9,7,3)
    set4+="Bootstrap" // Adding element to the set
    set7-=3
    var mergeSetResult = set3 ++ set4 // Merging two the sets
    var hashSet1 = HashSet(1,4,3,7,5,6)
    var bitSet1 = BitSet(2,3,8,5,9)
    var listSet1 =ListSet(25,22,35,19,31)
    
    println("Empty set : "+set1)
    println("The students in the set : "+set2)
    println("After merging : "+mergeSetResult)
    var valuesEmpty:String=if(set1.isEmpty)"Yes"else"No"
    println("Is this an empty set? "+valuesEmpty)
    println("The set contains 'C'! "+set3.contains("C"))
    println("The first element of the set is : "+set2.head)
    println("After removing the last element of the set : "+set2.tail)
    println("The size of the student set is : "+set2.size)
    println("After adding 'Bootstrap' to the set : "+set4)
    println("After removing all '3' from the set : "+set7)
    
    print("Iterating set through for loop : ")
    for(itrSet1 <- set3){
      print(" "+itrSet1)
    }
    
    print("\nIterating set through for each loop : ")
    set4.foreach { element:String => print(" "+element) }
    
    println("\nThe Union of two sets : "+set5.union(set6))
    println("The Intersection of two sets : "+set5.intersect(set6))
   
    println("Sorted set: "+sortedSet1)
   
    print("The elements in the hashset : ")
    hashSet1.foreach { hashElement:Int => print(" "+hashElement) }
    
    print("\nThe elements in the bitset : ")
    bitSet1.foreach { bitElement:Int => print(" "+bitElement) }
    
    print("\nThe elements in the listset : ")
    listSet1.foreach { listElement:Int => print(" "+listElement) }
  }
}