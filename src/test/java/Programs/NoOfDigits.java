package Programs;

import org.testng.annotations.Test;

public class NoOfDigits {
	
	@Test
	public void test() {
		
		
		int num=1234;
		int count =0;
		
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
