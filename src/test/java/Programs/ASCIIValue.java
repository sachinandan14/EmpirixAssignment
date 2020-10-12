package Programs;

import org.testng.annotations.Test;

public class ASCIIValue {
	
	@Test
	public void test() {
		
		
		char c='a';
		
		char c1='A';
		int asciiCapVal=c1;
		
		int asciiVal=c;
		
		int ascii=(int)c;
		
		System.out.println(asciiVal);
		System.out.println(ascii);
		System.out.println(asciiCapVal);
		
	}

}
