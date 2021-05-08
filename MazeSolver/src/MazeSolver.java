import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class MazeSolver {

	// 0 = wall
	// 1 = path
	// 2 = destination
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Maze> mazes = readMazes();	
		
		int i = 0;
		//System.out.println(mazes.size()); // prints the total amount of elements in ArraList "mazes"
		// while loop iterates through ArrayList "mazes" which contain elements  of class type "Maze" in "Mazes.txt"
		while(i < mazes.size()) {
			// if/else statement for "solveMaze" of type boolean when it returns true
			if (solveMaze(mazes.get(i))) {
				System.out.println("You won!");
			// if/else statement for "solveMaze" of type boolean when it returns false
			} else {
				System.out.println("No path");
			}
			i++;
		}
	}
	// this method allows program to read text file "Mazes.txt" and create and output an arrayList "mazes" and returned to the "main method"
	private static ArrayList<Maze> readMazes() throws FileNotFoundException {
		ArrayList<Maze> mazes = new ArrayList<Maze>();
		
		// calls constructor "Scanner" to create an object "in" is an instance of scanner 
		// reads text file "Mazes.txt"
		Scanner in = new Scanner(new File("Mazes.txt"));
		// while loop that continues to read until until there is no more text to read in text file, "Mazes.txt"
		while(in.hasNext()) {
			// calls constructor of class "Maze" to create object "m"
			Maze m = new Maze();
			// parseInt - parses the string argument as a signed decimal integer.
			int rows = Integer.parseInt(in.nextLine());
			//System.out.println("rows equals: " + " " + rows);
			
			// setting "rows as the size of y variable of the 2d array, "maze"
			// maze is a property of class "Maze"
			m.maze = new int [rows] [];
			// for loop iterates through each row using variable "rows" as the limit
			for(int i = 0; i < rows; i++) {
				// calls constructor of type "String" to read the next line of text file, "Mazes.txt"
				// prints out every row of the mazes within the text file, "Mazes.txt"
				String line = in.nextLine();
				//System.out.println(line);
				
				// (line.split(", ")) - takes the String "line" and breaks it up into different elements separated by ", " 
				// Arrays.stream - Takes the elements created by (line.split(", ")) and passes them into m.maze[i]
				// .mapToInt(Integer::parseInt).toArray() - takes the stream of elements created by Arrays.stream(line.split(", ")) and converts them to a stream of type "Int"
				m.maze[i] = Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).toArray();	
				//System.out.println(m.maze[i][0]);
			}
			
			m.start = new Position(Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
			//toss the extra space
			in.nextLine(); 
			
			mazes.add(m);
		}
		in.close();
		 
		return mazes;
		
	}

	private static boolean solveMaze(Maze m) {
		
		Position p = m.start;
		// "push" inserts "p" at the front of the LinkedList making it the starting point of the maze
		m.path.push(p);
		
		// repeating while statement evaluates as a boolean
		while(true) { 
			// tells program which row of the array
			int y = m.path.peek().y; 
			//System.out.println(y);
			// tells program which column of the array
			int x = m.path.peek().x; 
			//System.out.println(x);
			
			// changes the value for each visited iteration within maze from 1 to 0
			m.maze[y][x] = 0; 
			
			// down
			// if statements check logic and returns boolean (true or false), if this if statement returns "true"
			// if the if statement returns "true", program will execute the if statement within it
			if(isValid(y+1, x, m)) { 
				// if the program checks the next portion of the array and finds a "2"
				if(m.maze[y+1][x] == 2) {
					System.out.println("Moved down");
					// return - stops the program from executing
					return true;
				// if the program checks the next portion of the array and finds a "1"
				}else if (m.maze[y+1][x] == 1) {
					System.out.println("Moved down");
					// "push" inserts new point at the front of the LinkedList making it the point where the code will execute from
					m.path.push(new Position(y+1, x));
					// continue - moves on to next line
					continue;
				}
			}
		
			//left
			if(isValid(y, x-1, m)) {
				if(m.maze[y][x-1] == 2) {
					System.out.println("Moved left");
					return true;
				}else if (m.maze[y][x-1] == 1) {
					System.out.println("Moved left");
					m.path.push(new Position(y, x-1));
					continue;
				}
			}
			
			//up
			if(isValid(y-1, x, m)) {
				if(m.maze[y-1][x] == 2) {
					System.out.println("Moved up");
					return true;
				}else if (m.maze[y-1][x] == 1) {
					System.out.println("Moved up");
					m.path.push(new Position(y-1, x));
					continue;
				}
			}
			
			//right
			if(isValid(y, x+1, m)) {
				if(m.maze[y][x+1] == 2) {
					System.out.println("Moved right");
					return true;
				}else if (m.maze[y][x+1] == 1) {
					System.out.println("Moved right");
					m.path.push(new Position(y, x+1));
					continue;
				}
			}
			
			// pop - removes the first point at the beginning of the LinkedList
			/*Position p1 =*/ m.path.pop();
			//System.out.println("p1 = " + p1.x + " " + p1.y);
			System.out.println("Moved back");
			// if all values within LinkedList path are removed by "path.pop()", the maze cannot be solved
			if(m.path.size() <= 0) {
				return false;
			}
		}
		
	}

	// method used to stop program from iterating outside boundaries of array
	public static boolean isValid(int y, int x, Maze m) { 
		// if statement determines if "int y" or "int x" return values inside or outside boundaries of 2d array "maze"
		if(y < 0 || 
			y >= m.maze.length || 
			x < 0 || 
			x >= m.maze[y].length
		) {
			// returns false if "int y" or "int x" are outside of array
			return false;
		}
		// returns true if "int y" or "int x" are inside of the array
		return true;
	}
	
}
