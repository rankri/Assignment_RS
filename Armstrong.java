
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Armstrong numbers between 1 and 1000 are:");
		double calc = 0;
		
		double i =153;
		double x =i;
			
			
				while (i!=0) {
				double lastDigit = i%10;		
				calc = calc + (lastDigit*lastDigit*lastDigit);
				i = i/10;
				break;
				}
				
			if (calc ==x ) {
			System.out.print(x+" ");	
			
		}
			
		
			
	}

}
