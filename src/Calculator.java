/*
 * This is a calculator exercise.
 */

public class Calculator {
	 static double num_7;
	 /*
	  * Question: When creating a function do the types of the 
	  * parameter have to be defined right their or can they be
	  * defined at the top?
	  */
	public static void main(String[] args) {
		System.out.println("Now to do some operations.");
		
	}
	public static void add(double num_1,double num_2){
		double num_3=num_1+num_2;
		System.out.println(num_3);
	}
	public static void sub(double num_4,double num_5){
		double num_6 = num_4 - num_5;
		System.out.println(num_6);
	}
	public static void divide(double num_7, double num_8) {
		double num_9= num_7/num_8;
		System.out.println(num_9);
	}
	public static void multi(double num_10, double num_11) {
		double num_12= num_10*num_11;
		System.out.println(num_12);
	}
}	