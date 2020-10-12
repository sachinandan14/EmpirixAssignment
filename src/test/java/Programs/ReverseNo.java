package Programs;

import org.testng.annotations.Test;

public class ReverseNo {
	
	
	@Test
	public void test() {
		
		int n=681973;
		int rev=0;
		while(n>0) {
			
			int digit=n%10;
			rev=digit+(rev*10);
			
			n=n/10;
		}
		
		System.out.println(rev);
		
	}

}
