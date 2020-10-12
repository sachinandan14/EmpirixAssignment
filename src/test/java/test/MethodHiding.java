package test;

public class MethodHiding {
	
	
	
	 void  a() {
		System.out.println("a");
		
		
	}


static class B extends MethodHiding{
	
	 void  a() {
		System.out.println("b");
		
		
	}
	
}
	
	
	public static void main(String[] args) {
		
		MethodHiding obj=new MethodHiding();
		
		obj.a();
		
	}
}
