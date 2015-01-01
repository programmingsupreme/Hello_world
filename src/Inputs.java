import java.util.Scanner;

public class Inputs {
	static String user_input;
	 static int num_1;
	 static int num_2;
	 static int num_3;
	 static int num_4;
	 

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
			System.out.println("Inputs");
			Scanner scan = new Scanner(System.in);
			user_input=scan.nextLine();
			System.out.println(user_input);
			System.out.println("what is one plus one");
			num_1=scan.nextInt();
			System.out.println("Your anwser is " + num_1 + ".");
			System.out.println(" the correct awnser is 2.");
			// Now for a new scanner. always remember to use separate scanners for separate types
			Scanner scan_1 = new Scanner(System.in);
			System.out.println("Now to add two numbers.");
			System.out.println("Please enter the first number");
			num_2= scan_1.nextInt();
			System.out.println("Please enter the second number");
			num_3= scan_1.nextInt();
			System.out.println(num_2 +num_3);
			}
}
