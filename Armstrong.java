
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n,rem,sum=0;
		System.out.println("Armstrong between 1 and 1000 are:");
		for (double i=1; i<1000;i++) {
			n=i;
			while(n!=0) {
				rem = n%10;
				sum = sum + Math.pow(rem,3);
				n = n/10;
			}
			if (sum==i) {
				System.out.print(i+ " ");
			}
			sum = 0;
		}
		
		}		
	}


