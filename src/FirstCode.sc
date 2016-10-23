object FirstCode {
  println("Welcome to the Scala worksheet")

  // Creating a variable but every thing is object even the + is a function as scala is functional
  var num = 3
  var num1 = 5
  println(num + num1)



/* Creating a class with contructor
	Also we dont need to specify different constructor for different values as in java
	we ned to create diffrent contructors of every value
	we can achieve by
	
	
	 1 - var eobj = Employee();  // Constructor with no values
	 2 - var eobj = Employee(102); // wiht only one value if its the first parameter else
	 3 - var eobj = Employee(eName = "Aamir"); // Incase you are assigning the vakue to a diffrent parameter
	 																							which is not first
*/
  case class Employee(var eId: Int = 101, var eName: String = "Ahmad") {

  }

  var eObj = Employee();

}