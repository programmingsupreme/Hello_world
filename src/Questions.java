import java.util.Scanner;


public class Questions {
	static int awnser;
	static int x = 7;
	public static void main(String[] args){
		int num= 3;
		if( num==3);{
			System.out.println("hello this condition worked");
		}
		if (num<=3){
			System.out.println("Wow the number is less than or equal to three");
		}
		if (num>=3){
			System.out.println("Wow the number is greater hen or equal to three.");
		}
		for (int x=0;x<=10;x++){
			System.out.println(x);
		}
		for (int x=0;x<=10;x++){
			System.out.println("Hi this is me");
		}
		@SuppressWarnings({ "resource" })
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 10.");
		awnser= scan.nextInt();
		while (awnser != 7) {
			System.out.println("Guess again");
		}
		
	}
}
