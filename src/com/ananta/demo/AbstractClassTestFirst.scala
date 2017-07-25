package com.ananta.demo

abstract class AbstractAnimal{
  def barks()
}

class AbstractDog extends AbstractAnimal{
  def barks(){
    println("Dog barks")
  }
}

object AbstractClassTestFirst {
  def main(args: Array[String]): Unit = {
    var animalObject = new AbstractDog
    animalObject.barks()
  }
}