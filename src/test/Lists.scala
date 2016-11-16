package test

object Lists {
  def main(args: Array[String]): Unit = {
    var list = List(1,2)
    list = 3 :: list
    
    list.foreach { x => println(x) }
    list.foreach { println }
    println()
    println()

    var yu = (2,5,7)  // 元祖， 
    println(yu._1)
    println(yu._2)
    println(yu._3)
    
    
    
    
    
    
  }
  
}