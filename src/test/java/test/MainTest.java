package test;

public class MainTest {
	
	
	
	static {
		System.out.println("Static");
		
	}
	{
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Method1");
		main("Yes");
		MainTest t=new MainTest();
	}
	
	public static void main(String args) {
		System.out.println("Main Method2: "+args);
	}

}
