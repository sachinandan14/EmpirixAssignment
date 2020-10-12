package Programs;

import org.testng.annotations.Test;

public class GreatestThreeNo {
	
	
	@Test
	public void test() {
		
		int x=1000;
		int y=250;
		int z=1522;
		
		if(x>y&&x>z) {
			
			System.out.println("x is greatest no");
		}else if(y>z){
              System.out.println("y is greatest no");
			
		}else
		{
			 System.out.println("z is greatest no");
		}
		
		
	}

}
