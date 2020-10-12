package Programs;

import org.testng.annotations.Test;

public class AlphabetVowelORConsonant {
	
	@Test
	public void test() {
		//a e i o u
		char ch='e';
		
		if(ch=='a'||ch=='e'|| ch=='a' ||ch=='a' ||ch=='a') {
			System.out.println("vowel");
		}else {
			
			System.out.println("Consonant");
		}
		
		
	}

}
