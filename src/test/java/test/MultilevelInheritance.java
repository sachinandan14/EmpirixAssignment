package test;


class A{
	static
	{
		System.out.println("A");
	}
}

class B extends A{
	static
	{
		System.out.println("B");
	}
}
class C extends B{
	static
	{
		System.out.println("C");
	}
}



public class MultilevelInheritance {
	
	
	public static void main(String[] args) {
		C c=new C();
	}
	
	
	
	
	
	
	
	

}
