public class Student extends User {
	public boolean verified = true;
	public String major;
	
	public Student(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}

	@Override
	public void sayHello() {
		System.out.println("Hi my major is " + major + 
				". My name is " + firstName + " " + lastName);
	}
}
