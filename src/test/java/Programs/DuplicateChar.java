package Programs;

import java.util.LinkedList;

import org.testng.annotations.Test;

public class DuplicateChar {
	
	//@Test
	//public void findDuplicate() {
	
	public static void main(String[] args) {
		
	
		
		String s="Hello";
		
		char ch[]=s.toCharArray();
		
		String res="";
		LinkedList<Character> list=new LinkedList();
		
		
		for(int i=0;i<ch.length;i++) {
			int count=1;
			
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate character : "+ch[i]);
					count++;
				}}
				if(count==1) {
					
					res=res+ch[i];
					
				}
				
			}
		
		
		System.out.println("After removing duplicate : "+res);
		
	}

}
