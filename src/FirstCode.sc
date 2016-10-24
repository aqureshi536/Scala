object FirstCode {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  // Creating a variable but every thing is object even the + is a function as scala is functional
  var num = 3 // assign a value                   //> num  : Int = 3
  //automatically it will take the type else
  var num1: Int = 5; // Specifying this defines the datatype but there are no primitive datatype in scala
                                                  //> num1  : Int = 5
  println(num1+num);                              //> 8

  // "var" in scala is something that can be changed

  /* Creating a class with contructor
	Also we dont need to specify different constructor for different values as in java
	we ned to create diffrent contructors of every value
	we can achieve by
	
	
	 1 - var eobj = Employee();  // Constructor with no values
	 2 - var eobj = Employee(102); // wiht only one value if its the first parameter else
	 3 - var eobj = Employee(eName = "Aamir"); // Incase you are assigning the vakue to a diffrent parameter
	 																							which is not first
	 4 - var eobj = Employee(104,"Aamir");  // Incase you want to change the default values
*/

  case class Employee(var eId: Int = 101, var eName: String = "Ahmad") {
    //Class defination
  }

  // Object Creation wiht name "eObj"
  var eObj = Employee();                          //> eObj  : FirstCode.Employee = Employee(101,Ahmad)

  //For loop thia works as
  /*for( var x <- Range ){
   			statement(s);
			}
			
			'<-' is called as generator as it is generating values
*/
  for (i <- 1 to 10){
    println(i)                                    //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
  }
  
  /*
  While loop creation and use
  */
  
  var a = 5;                                      //> a  : Int = 5
  while(a>=0){
  println(a);
  a -= 1;
  }                                               //> 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
  // do .. while loop
    var b = 5                                     //> b  : Int = 5
 do {
 println(6)
 }while(b>6)                                      //> 6
 	println(b)                                //> 5
 
 
}