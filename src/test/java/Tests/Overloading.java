package Tests;

public class Overloading {
	
	public void payment(int a, Float b) {
		
		System.out.println("First Method");
	}
	
public void payment(String a, int b) {
	System.out.println("Second Method");
		
	}

public static void main(String[] args) {
	
	Overloading obj=new Overloading();
	obj.payment(1, 1.2f);
}

}
