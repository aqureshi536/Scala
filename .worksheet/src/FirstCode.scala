object FirstCode {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(133); 

  // Creating a variable but every thing is object even the + is a function as scala is functional
  var num = 3;System.out.println("""num  : Int = """ + $show(num ));$skip(151);  // assign a value
  //automatically it will take the type else
  var num1: Int = 5;System.out.println("""num1  : Int = """ + $show(num1 ));$skip(23); ; // Specifying this defines the datatype but there are no primitive datatype in scala
  println(num1 + num);

  // "var" in scala is something that can be changed

  /*    ############    Creating a class with contructor  ###########
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
  };$skip(844); 

  // Object Creation wiht name "eObj"
  var eObj = Employee();System.out.println("""eObj  : FirstCode.Employee = """ + $show(eObj ));$skip(184); ;

  //For loop thia works as
  /*for( var x <- Range ){
   			statement(s);
			}
			
			'<-' is called as generator as it is generating values
*/
  for (i <- 1 to 10) {
    println(i)
  };$skip(41); 
  
  for{i<- 10 to  20}
  println(i);$skip(57); 

  /*
  While loop creation and use
  */

  var a = 5;System.out.println("""a  : Int = """ + $show(a ));$skip(51); ;
  while (a >= 0) {
    println(a);
    a -= 1;
  };$skip(34); 
  // do .. while loop
  var b = 5;System.out.println("""b  : Int = """ + $show(b ));$skip(40); 
  do {
    println(6)
  } while (b > 6);$skip(13); 
  println(b)

  //  ###### ways to define a function function #####
  case class Student(var marks: Int = 90) {
    def show() = println("I'm in student show") // for a function with single statement

    def display() = { // for a statement with multiple lines we have to put {}

      println("I'm in student display");
      println("Hello from student display")
    }

    // operators can be used as the function names
    def >(s: Student): Boolean = {
      marks > s.marks
      
      
    }

  };$skip(527); 

  var student = Student();System.out.println("""student  : FirstCode.Student = """ + $show(student ));$skip(17); ;
  student.show();$skip(20); 
  student.display();$skip(42); 

  var functionDemoStudent = Student(89);System.out.println("""functionDemoStudent  : FirstCode.Student = """ + $show(functionDemoStudent ));$skip(69); val res$0 = 
  //student.>(functionDemoStudent);
  student > functionDemoStudent;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(72); ;

  // creating a list of elements
  var elements = List(1, 2, 3, 4, 5);System.out.println("""elements  : List[Int] = """ + $show(elements ));$skip(85); 

  // for each loop
  elements.foreach { i: Int =>
    {
      println(i)
    }
  };$skip(226); 
                                                  
// to reverse the list of elements unlike java we dont affect the original list instead scala creates a new list behind the scenes
  var reverseOfElemnts  = elements.reverse;System.out.println("""reverseOfElemnts  : List[Int] = """ + $show(reverseOfElemnts ));$skip(77); val res$1 = 
   //this too will not affect original list
  reverseOfElemnts drop 2 take 1;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(124); 
    
   // list of element with multiple type  refer type hierarchy for scala
   var anyElements = List(1,3.3,true,"Ahmad");System.out.println("""anyElements  : List[Any] = """ + $show(anyElements ))}
}
