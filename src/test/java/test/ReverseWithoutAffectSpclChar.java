package test;

public class ReverseWithoutAffectSpclChar {
	
	
	public static void main(String[] args) {
		
		String s="Sach&^i%n#sam@n!ta";
		char ch[]=s.toCharArray();
		
		int r=ch.length-1, l=0;	
		
		while(l<r) {
			
			if(!Character.isAlphabetic(ch[l]))
				l++;
			else if(!Character.isAlphabetic(ch[r]))
					r--;
			else
			{
			char temp=ch[l];
			ch[l]=ch[r];
			ch[r]=temp;
			l++;
			r--;
			
				
			}
			
			
			
		}
			
			
		System.out.println(ch);	
		
		
		
	}

}
