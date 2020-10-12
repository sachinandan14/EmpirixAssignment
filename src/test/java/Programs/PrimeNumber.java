package Programs;

import org.testng.annotations.Test;

public class PrimeNumber {
	
	
	@Test
	public void test() {
		
		boolean flag=false;
		
		int n=39;
		
		for(int i=2;i<=n/2;i++) {
		
		if(n%i==0) {
			
			flag=true;
			System.out.println(n+"is not a prime number");
			break;
			
		}
		}
			if(flag==false) {
				
				System.out.println(n+"is a prime number");
			
		}
		}
}
