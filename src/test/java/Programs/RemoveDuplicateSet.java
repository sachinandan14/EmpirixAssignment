package Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateSet {
	
	public static void main(String[] args) {
		
		String s="Hello";
		
		char ch[]=s.toCharArray();
	Set<Character> hs=new LinkedHashSet<Character>();
	StringBuilder sb=new StringBuilder();
		
		for(Character character: ch) {
			
			if(hs.add(character)==true) {
				sb.append(character);
			}
			
			
			
		}
		
		
		System.out.println(hs);
		System.out.println(sb);
	}
	
	

}
