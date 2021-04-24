import java.util.Scanner;

public class Mysweetprogram {
	
	public static void main(String[] args) {
		
		String password = "let me in";
		Scanner scanner = new Scanner(System.in);
		String guess;
		do {
			System.out.println("Guess the password:");
			guess = scanner.nextLine();
		} while(!guess.equals(password));

		System.out.println("Congrats");
		scanner.close();		
	}
}		

























		//Tutorial 24
		//icu
		//initialization
		//comparison/condition
		//update
		
		//System.out.println("Guess the password:");
		//String password = "let me in";
		//Scanner scanner = new Scanner(System.in);
		//String guess = scanner.nextLine();
		
		//while(!guess.equals(password))
		//{
		//	System.out.println("Guess the password:");
		//	guess = scanner.nextLine();
		//}
		//System.out.println("Congrats");
		//scanner.close();

		









		











		




		//Tutorial 23
		//String name = "Clare";
		
		//boolean welcome = name.equals("Clare") ? true : false;
		
		//boolean welcome = false;
		
		//if(name.toLowerCase().equals("clare")) welcome = true;
		//	System.out.println("Welcome, Clare!");
		
		//System.out.println(welcome);

		



		









	












		//Tutorial 21
		//System.out.println("What's your name?");
		
		//Scanner scanner = new Scanner(System.in);
		//String name = scanner.nextLine();
		
		//switch(name) {
			
			//case "Caleb":
			//case "Clare":
				//System.out.println("Go away");
				//break;
			//default:
				//System.out.println("Try again later");
				//break;
		//}

		
		
		
		
		
		
		


















		//Tutorial 20
		//System.out.println("How old are you?");
		
		//Scanner scanner = new Scanner(System.in);
		//int age = Integer.parseInt(scanner.nextLine());
		
		//System.out.println("Cats or dogs?");
		//String animal = scanner.nextLine();
		
		//if(age > 12 && !animal.equals("dogs")) 
//comparison operator - == equality != inequality < less than > great than <= less than or equal to >= greater than or equal to
//logical operators - && and (both are true || or (either can be true or both) ! not (inverse the boolean)
		//{
			//System.out.println("Welcome!");
		//}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Tutorial 19
		//String password = "let me in";
		//System.out.println("Guess the password: ");
				
		//Scanner scanner = new Scanner(System.in);
		//String guess = scanner.nextLine();

		
		//if(password.toLowerCase().equals(guess.toLowerCase()))
		//{
			//System.out.println("Your guess was correct!");
			
		//} else if ("don't stop believing".toLowerCase().equals(guess.toLowerCase())) 
		//{
		//	System.out.println("You got the second passowrd");
		//} else
		//{ 
		//	System.out.println("This is false");
		//}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Tutorial 18
		//String password = "let me in";
		//System.out.println("Guess the password: ");
		
		//Scanner scanner = new Scanner(System.in);
		//String guess = scanner.nextLine();
		
		//System.out.println(password.equals(guess));
		
		//System.out.println(password == guess);
		
		//String a = new String("hi");
		//String b = new String("hi");
		//System.out.println(a == b);
		
		//int x = 10;
		//int y = 10;
		//System.out.println(x == y);
		
		//primitives - this works
	
		//objects - this does not work
		//value of objects is a reference to the object
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Tutorial 17
	//	User user = new User();
	//	user.firstName = "Caleb"; //setting a property
	//	user.lastName = "Curry";
	//	System.out.println(user.getFullNAME());
		
	//	String x = "hello";
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	//Tutorial 16
	//	String fullAd = "yummmm...MY OH MY chicken pot pie. Now with 20% more chikn\n";
	//	String password = "let me in";
	//	System.out.println("Guess the password: ");
	//	//input
	//	Scanner scanner = new Scanner(System.in);
	//	String guess = scanner.nextLine();
	//	System.out.println(password.equals(guess));















//boolean ispizzadelicious = true;
//byte b = 'C'; //sequence of 8 bits 00101010
//char c = 'Z';
//short s = -32768;
//int i = 4343434;
//long l = 50L;

//float f = 20.5f;
//double d = 20.5;


//variable creation
//1. declare
//2. initialize

//primitive types - boolean, byte, char, short, int, long, float and double
//objects - instance of a class (data type)

//staticly typed - variables are given data points up front
//dynamically typed - variables do not have types

//data type - the type of data. How the computer interprets the data

//literals - the value
//variable - stores a value
//expression - evaluates to a value
//operator - works on operands to produce a value
//operand - things affected by the operator

//comment
//class - contains everything and has members
//methods - do something
//arguments - what you pass to a method (part of calling)
//parameter - where an argument is stored (args) (part of definition)
//statements - telling the computer to do something
//properties - store something
		
//access modifier - public or private who can use it
//static - no instance of classes needed
//object - instance of a class		