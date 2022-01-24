import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner numInput = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = numInput.nextInt();
		if(num%4==0) {
			System.out.println("Given Year is a Leap year");
		}
		else {
				System.out.println("Given Year is not a Leap year");
			}
		numInput.close();
	}

}
