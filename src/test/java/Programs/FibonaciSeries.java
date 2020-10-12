package Programs;

public class FibonaciSeries {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int res = 0;
		int n=10;
		
		System.out.print(a+" "+b);
		for(int i=2;i<=n-1;i++) {
			res=a+b;
			a=b;
			b=res;
			System.out.print(" "+res);
			
			
		}
	
		
		
		
		
	}

}
