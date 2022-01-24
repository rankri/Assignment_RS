
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println("Prime Numbers between 1 and 100 are:");
		for (int i=2; i<100; i++)
		{
			if(i==2||i==3||i==5||i==7||i==9) {
				
				System.out.print(i+" ");
			}
			if(i%2==1) {
				int x[]=new int[21];
				for (int j=0; j<=x.length;++j) {
					
					 x[j] = i;
					 if (x[j]%3!=0 && x[j]%5!=0 && x[j]%7!=0 && x[j]%9!=0)
					System.out.print(x[j]+" ");
					break;
				}	
			}	
			}
			}		
		}
		
	


