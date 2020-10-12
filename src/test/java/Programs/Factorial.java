package Programs;

import org.testng.annotations.Test;

public class Factorial {
	
	@Test
	public void test1() {
		
		int fact=1;
		int n=5;
		for(int i=1;i<=n;i++) {
			
			fact=fact*i;
		}
		
		System.out.println(fact);
	}
	
	static int fact(int n){
		if(n==1)
		return 1;
		else {

		return n=n*fact(n-1);
		}
	}
	@Test
	public void factWithoutLoop() {

		int f=fact(5);
		System.out.println(f);
	}



}
