package test

object Test {
  def main(args: Array[String]): Unit = {
    println("Hello World!")
    println
    
    test();
   }
  

  def test(){
	  var gs = new Array[String](3);
	  gs(0) = "hello";
	  gs(1) = "world "
			  gs(2) = "babe"
			  for(i <- 0 to 2)
				  print(gs(i))
  }
}

