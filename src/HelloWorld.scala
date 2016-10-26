//This is my first scala code to display some output

object HelloWorld {
  def main(args: Array[String]) {
    for{i<-1 to 10}
    println(i)
   
    var array :Array[String] = new Array(3)
    array(0) = "Ahmad"
    array(1) = "Aaamir"
    array(2) = "Siraj"
    for(element <- array){
      println(element)
    }
    def meth() = "Hello World"
    
    println(meth)
    
    def meth1():String = {"hi"}
    def meth2():String = {
        val d = new java.util.Date()
        d.toString()
    }

  
    println(meth1 )
    println(meth2 )
    
    var obj = new FloidTriangle();
    obj pattern()
 
  }
  case class FloidTriangle(){
    
    def pattern(){
      
      for(i<- 0 to 4){
        for(j<-0 until i){
        print("*")
        }
        println("")
      }
    }
    
  }

  

}