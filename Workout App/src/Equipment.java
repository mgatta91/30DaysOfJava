import java.util.Scanner;

public class Equipment {

	public static void main(String[] args) {
		
		Boolean dumbells = false;
		Boolean barbell = false;
		Boolean squatRack = false;
		Boolean adjustableBench = false;
		
		String equip;
		
		do
		{  
			System.out.println("Do you have access to dumbbells? Y/N");
			Scanner scanner = new Scanner(System.in);
			equip = scanner.nextLine();

			if(equip.toUpperCase().equals("Y")) 
			{
				System.out.println("Great");
				dumbells = true;
			} 
			else if(equip.toUpperCase().equals("N")) 
			{
				
			}
	    } while ( !(equip.toUpperCase().equals ("Y")) && !(equip.toUpperCase().equals ("N"))) ;

		do 
		{
			System.out.println("Do you have access to a barbell?");	
			Scanner scanner = new Scanner(System.in);
			equip = scanner.nextLine();
			
			if(equip.toUpperCase().equals("Y"))
			{
				System.out.println("Great");
				barbell = true;
			}
			else if(equip.toUpperCase().equals("N"))	
			{
				
			}
		} while ( !(equip.toUpperCase().equals ("Y")) && !(equip.toUpperCase().equals ("N"))) ;
		
		do 
		{
			System.out.println("Do you have access to a squat rack?");	
			Scanner scanner = new Scanner(System.in);
			equip = scanner.nextLine();
			
			if(equip.toUpperCase().equals("Y"))
			{
				System.out.println("Great");
				squatRack = true;
			}
			else if(equip.toUpperCase().equals("N"))	
			{
				
			}
		} while ( !(equip.toUpperCase().equals ("Y")) && !(equip.toUpperCase().equals ("N"))) ;
		
		do 
		{
			System.out.println("Do you have access to an adjustable bench?");	
			Scanner scanner = new Scanner(System.in);
			equip = scanner.nextLine();
			
			if(equip.toUpperCase().equals("Y"))
			{
				System.out.println("Great");
				adjustableBench = true;
			}
			else if(equip.toUpperCase().equals("N"))	
			{
				
			}
		} while ( !(equip.toUpperCase().equals ("Y")) && !(equip.toUpperCase().equals ("N"))) ;
		
		
	}
}
