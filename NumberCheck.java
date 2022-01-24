import java.util.Scanner;
public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numInput = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = numInput.nextInt();
		if(num%2==0) {
			System.out.println("Given Number is Even Number");
		}
		else {
				System.out.println("Given Number is Odd Number");
			}
		numInput.close();
		}
	}

