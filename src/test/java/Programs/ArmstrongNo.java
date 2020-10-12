package Programs;

import org.testng.annotations.Test;

public class ArmstrongNo {
	
	@Test
	public void test() {
		
		int num=153;
		int actNum=num;
		double res=0;
		
		while(actNum!=0) {
			int n=actNum%10;
			res=res+Math.pow(n, 3);
			actNum=actNum/10;
		}
		if(res==num) {
			System.out.println("is armstrong no");
		}else {
			System.out.println("not armstrong no");
		}
		
	}

}
