import java.util.LinkedList;

public class MazeSolver {

	// created 2d array to represent a  maze containing primitive "int"
	static int [][] maze = { 
			{1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
			{0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0},
			{0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1},
			{1, 1, 1, 2, 0, 1, 0, 1, 0, 1, 0},
			{0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1}
	};
	// 0 = wall
	// 1 = path
	// 2 = destination
	
	// constructor created a LinkedList type "Position" named "path"
	static LinkedList<Position> path = new LinkedList<Position>(); 
	
	public static void main(String[] args) {
		// constructor created a new object, "p", which is an instance of class "Position" 
		Position p = new Position(4, 8); 
		// "push" inserts "p" at the front of the LinkedList making it the starting point of the maze
		path.push(p);
		
		// repeating while statement evaluates as a boolean
		while(true) { 
			// tells program which row of the array
			int y = path.peek().y; 
			System.out.println(y);
			// tells program which column of the array
			int x = path.peek().x; 
			System.out.println(x);
			
			// changes the value for each visited iteration within maze from 1 to 0
			maze[y][x] = 0; 
			
			// down
			// if statements check logic and returns boolean (true or false), if this if statement returns "true"
			// if the if statement returns "true", program will execute the if statement within it
			if(isValid(y+1, x)) { 
				// if the program checks the next portion of the array and finds a "2"
				if(maze[y+1][x] == 2) {
					System.out.println("Moved down. You won!");
					// return - stops the program from executing
					return;
				// if the program checks the next portion of the array and finds a "1"
				}else if (maze[y+1][x] == 1) {
					System.out.println("Moved down");
					// "push" inserts new point at the front of the LinkedList making it the point where the code will execute from
					path.push(new Position(y+1, x));
					// continue - moves on to next line
					continue;
				}
			}
		
			//left
			if(isValid(y, x-1)) {
				if(maze[y][x-1] == 2) {
					System.out.println("Moved left. You won!");
					return;
				}else if (maze[y][x-1] == 1) {
					System.out.println("Moved left");
					path.push(new Position(y, x-1));
					continue;
				}
			}
			
			//up
			if(isValid(y-1, x)) {
				if(maze[y-1][x] == 2) {
					System.out.println("Moved up. You won!");
					return;
				}else if (maze[y-1][x] == 1) {
					System.out.println("Moved up");
					path.push(new Position(y-1, x));
					continue;
				}
			}
			
			//right
			if(isValid(y, x+1)) {
				if(maze[y][x+1] == 2) {
					System.out.println("Moved right. You won!");
					return;
				}else if (maze[y][x+1] == 1) {
					System.out.println("Moved right");
					path.push(new Position(y, x+1));
					continue;
				}
			}
			
			// pop - removes the first point at the beginning of the LinkedList
			/*Position p1 =*/ path.pop();
			//System.out.println("p1 = " + p1.x + " " + p1.y);
			System.out.println("Moved back");
			// if all values within LinkedList path are removed by "path.pop()", the maze cannot be solved
			if(path.size() <= 0) {
				System.out.println("No path");
				return;
			}
		}
	}
	
	// method used to stop program from iterating outside boundaries of array
	public static boolean isValid(int y, int x) { 
		// if statement determines if "int y" or "int x" return values inside or outside boundaries of 2d array "maze"
		if(y < 0 || 
			y >= maze.length || 
			x < 0 || 
			x >= maze[y].length
		) {
			// returns false if "int y" or "int x" are outside of array
			return false;
		}
		// returns true if "int y" or "int x" are inside of the array
		return true;
	}
	
}
