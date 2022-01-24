
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0;
		int n2 = 1;
		
		System.out.print(n1+" "+n2);
		
		for (int i=2; i<12; i++) 
		{
			int fibo = n1 + n2;
			
				System.out.print(fibo+" ");
				n1 = n2;
				n2 = fibo;
			}
		}
	}


