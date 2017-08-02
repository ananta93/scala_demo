package com.ananta.demo

class ExtendingThread extends Thread{
  override def run(){
    println("Threading example by extending thread class")
  }
}

class ExtendingRunnable extends Runnable{
  override def run(){
    println("Threading example extending runnable interface")
  }
}

object ThreadExtendsFirst {
  def main(args: Array[String]): Unit = {
    var threadObj = new ExtendingThread
    threadObj.start()
    
    var runnableObject = new ExtendingRunnable
    runnableObject.run()
  }
}