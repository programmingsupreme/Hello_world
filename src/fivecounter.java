public class fivecounter{
	public static void main(String[] args) {
		System.out.println("Now to count to five using a method");
		countfive();
		System.out.println("Done.");
	}
	public static void countfive() {
		for(int x=0; x<=5; x++) {
			System.out.println(x);
		}
	}
	
}