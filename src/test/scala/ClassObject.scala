package test.scala

/**
 * 伴生对象
 * 伴生类
 * 可以互相访问私有成员
 */
class ClassObject {
  private val a = 23;
  def add(s : Int)={s + 1}
  
}
object ClassObject{
  def main(args : Array[String]){
    val co = new ClassObject
    println(co.add(2))
    println(co.a)
  }
  
}
