// format for generic class 
// <T, U> - syntax which makes the class generic
// <T, U> - allows properties of class "Pair" to be set upon the class being called
public class Pair <T, U> {
	
	//assigned the properties "T" and "U" corresponding variables
	private T x;
	private U y;
	
	// created getter for property "T" to return "x"
	T getX() {
		return x;
	}
	// created setter for property "T" so the values assigned for "x" are set to "T"
	void setX(T x) {
		this.x = x;
	}
	
	U getY() {
		return y;
	}
	
	void setY(U y) {
		this.y = y;
	}
}
