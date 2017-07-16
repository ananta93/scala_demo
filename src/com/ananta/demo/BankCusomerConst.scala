package com.ananta.demo

class account(ac_id:Int,name:String,balance:Double){
  def this(a:Int,n:String){
    this(a,n,0)
  }
  def this(a:Int){
    this(a,"",0)
  }
  def this(){
    this(0,"",0);
  }  
  def show(){
    println("Name: "+name)
    println("AC_Id: "+ac_id)
    println("Balance: "+balance)
  }
}

object BankCusomerConst {
  def main(args: Array[String]): Unit = {
    var a=new account(12,"Ananta",100000)
    a.show()
    println()
    var b=new account(13,"Ananta Das")
    b.show()
    println()
    var c=new account(14)
    c.show()
  }
}