package com.ananta.demo

import java.io.File
import java.io.PrintWriter
import scala.io.Source

object CreateFileFirst {
  def main(args: Array[String]): Unit = {
    val resourceFolder = new File("C:\\Users/Ananta/workspace/scala_demo/src/com/ananta/resources")
    if (!resourceFolder.exists()) {
      resourceFolder.mkdir()
    }
    var sampleFile: String = resourceFolder + "/simple_text.txt"
    var printWriter = new PrintWriter(sampleFile)
    printWriter.write("This is a sample text file")
    printWriter.close()
    
    var readingFIle = Source.fromFile(sampleFile)
    for(fileLine <- readingFIle){
      print(fileLine)
    }
    readingFIle.close()
  }
}