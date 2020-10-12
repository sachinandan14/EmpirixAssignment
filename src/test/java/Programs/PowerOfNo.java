package Programs;

import org.testng.annotations.Test;

public class PowerOfNo {
	
	@Test
	public void test() {
		
		int base=2;
		int exponent=5;
		long result=1;
		
		
		while(exponent!=0) {
			result=result*base;
			exponent--;
		}
		System.out.println(result);
	}

}
