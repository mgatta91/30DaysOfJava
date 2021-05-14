import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		
// HASH, HASH, HASH, HASH, HASH, HASH, HASH, HASH, HASH, HASH, HASH, HASH, HASH, HASH, HASH, HASH, HASH
		
		// created a HashSet called "persons" containing elements of class "Person"
		HashSet<Person> persons = new HashSet<Person>();
		
		// created a new object of class "Person" called "p" and added values to properties "email" and "ln"
		Person p = new Person("Caleb@email.com", "Curry");
		// used this syntax to give property "Position" a value because "Position" was not included in the constructor for class "Person"
		// created new object of class "Position", a property of class "Person" and called it "pos1"
		Position pos1 = new Position(10,10);
		// assigned pos1 as the value for the property for "Position" for the object "p"
		p.position = pos1;
		
		Person q = new Person("Caleb@email.com", "Curry");
		Position pos2 = new Position(100,10);
		q.position = pos2;
		
		// added objects "p" and "q" to the HashSet "persons"
		persons.add(p);
		persons.add(q);
		
		System.out.println(p.equals(q));
		System.out.println(p.hashCode());
		System.out.println(q.hashCode());

// GENERIC CLASS, GENERIC CLASS, GENERIC CLASS, GENERIC CLASS, GENERIC CLASS, GENERIC CLASS, GENERIC CLASS
		
		// created and object of class "Pair" called "pair"
		// assigned types "<Integer, String>" as the properties "<T, U>" 
		Pair<Integer, String> pair = new Pair<Integer, String>();
		// set the values of "X" and "Y"
		pair.setX(7);
		pair.setY("favorite number");
		
		Pair<Integer, String> pair2 = new Pair<Integer, String>();
		pair2.setX(10);
		pair2.setY("number of subscribers")
		
		// created an Array	List of class "Pair" called "pears"
		// assigned types "<Integer, String>" as the properties "<T, U>" 
		ArrayList<Pair<Integer, String>> pears = new ArrayList<Pair<Integer, String>>();
		// added objects "pair" and "pair2" to the ArrayList "pears"
		pears.add(pair);
		pears.add(pair2);
		
// SUBCLASS, SUBCLASS, SUBCLASS, SUBCLASS, SUBCLASS, SUBCLASS, SUBCLASS, SUBCLASS, SUBCLASS, SUBCLASS
		
		// created an object called "a" which is of class "Admin"
		Admin a = new Admin();
		// used this syntax to give properties "email" and "ln" a value because we didn't create a constructor for class "Admin"
		// assigned object "a" values for the properties "email" and "ln"
		a.email = "Caleb@email.com";
		a.ln = "curry";
		
		// created ArrayList called "admins" containing elements of class "Admin
		ArrayList<Admin> admins = new ArrayList<Admin>();
		// added object "a" to the ArrayList "admins" 
		admins.add(a);
		
		// syntax to insert the elements of ArrayList "admins" into the List "people" containing typer "Person"
		// this works because ArrayList "admins" contains elements of class "Admin" which is a subclass of class "Person"
		List<Person> people = (List<Person>)(List<?>)admins;
		
		// tells the method "doSomething" to work on the contents of List "people"
		doSomething(people);
		
	}
	
	// created a method "doSomething"
	static void doSomething(List<Person> peeps) {
		// created for loop to iterate through "List<Person> peeps"
		for(Person p : peeps) {
			System.out.println(p.email + " " + p.ln);
		}
	}
	
}