import java.util.Scanner;

public class projectNew {

	public static void main(String[] args) {
		// Header
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
	
		Scanner userInput = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equals("y")) {
		
		// User input for length
		System.out.print("Enter Length: ");
		double length = userInput.nextDouble();
		
		
		//User input for width
		System.out.print("Enter Width: ");
		double width = userInput.nextDouble();

		// Calculations for Area and Perimeter
		double area = (width * length);
		double perimeter = (length*2 + width*2);
		System.out.println("Area:" + area);
		System.out.println("Perimeter: " + perimeter);
		
		
		// Ask user if they wish to continue and prompt y or n
		System.out.print("Continue? (y/n)");
	        userInput.nextLine();
		choice = userInput.nextLine();
		}
		
	}

}
