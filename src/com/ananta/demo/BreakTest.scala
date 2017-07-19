package demo_test

import scala.util.control.Breaks._  // importing package

object BreakTest {
  def main(args: Array[String]): Unit = {
    breakable {                  // Breakable method to avoid exception  
      for (i <- 1 to 10) {
        if (i == 5)
          break                 // use of break
        else
          println(i)
      }
    }
  }
}
