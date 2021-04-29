public class MySweetProgram {

	public static void main(String[] args) { 
		int[][] data = {
				{4, 6, 3, 10},
				{4, 2, 40, 1, 5, 3, 2, 30},
				{5, 34, 1, 43}
		};
		
		//data[1][2] = 49; change value of an array
		//System.out.println(data [1] [2]); access a particular element of an array
		//iterate through a 2d array
		for(int i = 0; i < data.length; i++) { //iterate rows
			for (int k = 0; k < data[i].length; k++) { //iterate columns
				System.out.print(data[i][k] + " ");
			}
			System.out.println();
		}
	}
	
}