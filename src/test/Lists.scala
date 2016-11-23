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
    
    
    println(Lists.out)
    
    
    println( List(1,2) == List(1,2)) // true  scala 将转换为调用equals
    println( List(1,2) eq List(1,2)) // false  eq等于java里的==
    println(List(1,2) equals List(1,2))
    
  }
  
  def out={"singleton?" + this}
  
}