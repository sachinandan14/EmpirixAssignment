package test;

public class Parent {
	
	Parent()
	{
		System.out.println("Parent");
	}
	
	class Child extends Parent{
		Child(){
			super();
			System.out.println("Child");
		}
		
	}
	
	 public static void main(String[] args) {
		 System.out.println("Super");
	}
}