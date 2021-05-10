import java.util.Objects;

public class Person {
	String email;
	String ln;
	Position position;
	
	Person(String email, String ln) {
		this.email = email;
		this.ln = ln;
	}
	// to generate this code - right click -> source -> generate hashCode() and equals ()
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
