package Programs;

import org.testng.annotations.Test;

public class PrimeNumberBetween {
	
	
	@Test
	public void test() {
		
		
		
		int low=20;
		int high=50;
		while(low<high) {
			boolean flag=false;
		
		
		for(int i=2;i<=low/2;i++) {
			
		
		
		if(low%i==0) {
			
			flag=true;
			break;
			
		}
		}
			if(!flag) {
				
				System.out.println(low+" ");
			
		}
			low++;
		}
}
}