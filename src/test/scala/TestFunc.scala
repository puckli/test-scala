package test.scala

object TestFunc {
  def main(args: Array[String]):Unit={
   val g6 = "dd"
    
    println(g) // hello def=g{}
    println(h) // 输出：() 
    
    test("332y")
  }
  
  def g={"hello def=g{}"} // 有返回值
  def h{"hello def h"} // 无返回值
  
  def test(s : String){
    for(ss <- s){
      println(ss.toByte)
    }
  }
}