package test.singltton

object TestObj {
  def main(args : Array[String]){
    var s = new Cla
    var d = new Cla
    
    println(s)
    println(d)
    
    println(s.v)
    println(d)
    
    
  }
}