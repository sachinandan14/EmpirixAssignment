package Programs;

public class Palindrome {
	
	
	
	
	public static void main(String[] args) {
		
		
		int r,sum=0;
		int n=454;
		int temp=n;
		
		while(n>0) {
			
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Prime no");
		}
	}

}
