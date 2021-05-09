import java.util.HashSet;

public class Collections {

	public static void main(String[] args) {
	HashSet<Person> words = new HashSet<Person>();
		
		Person p = new Person("email@email.com", "Curry");
		Position pos1 = new Position(10,10);
		p.position = pos1;
		
		Person q = new Person("email@email.com", "Curry");
		Position pos2 = new Position(10,10);
		q.position = pos1;
		
		System.out.println(p.equals(q));
		System.out.println(p.hashCode());
		System.out.println(q.hashCode());

	}

}
