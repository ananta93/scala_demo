package com.ananta.demo

import java.util.Date

class ThreadTest extends Thread{
  override def run(){
    for(i <- 1 to 3){
      println(this.getName+" : "+i)
      Thread.sleep(500)
      println("The priority of the thread is : "+this.getPriority)
    }
  }
}

object ThreadOprations {
  def main(args: Array[String]): Unit = {

    var threadObj1 = new ThreadTest
    threadObj1.setName("First thread")
    threadObj1.setPriority(Thread.MIN_PRIORITY)
    var threadObj2 = new ThreadTest
    threadObj2.setName("Second thread")
    var threadObj3 = new ThreadTest
    threadObj3.setName("Third thread")
    threadObj3.setPriority(Thread.MAX_PRIORITY)
    
    threadObj1.start()
    threadObj2.start()
    threadObj2.join()
    threadObj3.start()
  }
}