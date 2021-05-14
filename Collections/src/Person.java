import java.util.Objects;

public class Person {
	
	// properties of class "Person"
	String email;
	String ln;
	Position position;
	
	// constructor used to assign properties to class "Person"
	Person(String email, String ln) {
		
		// lets program know the properties are being used as part of the constructor
		this.email = email;
		this.ln = ln;
	}
	
	// default constructor - used to allow class "Pair" to be a subclass of class "person"
	Person(){
		
	}
	
	// to generate OVERRIDE - right click -> source -> generate hashCode() and equals ()
	// used this code for hash, looks at code based on the value of the properties instead of the memory address
	@Override
	public int hashCode() {
		// need to list all properties which hashCode will compare within parenthesis
		return Objects.hash(email, ln, position);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (ln == null) {
			if (other.ln != null)
				return false;
		} else if (!ln.equals(other.ln))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}
	
	
}
