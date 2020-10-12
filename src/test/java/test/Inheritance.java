package test;



	
	class Base1{
		int i=10;
		public  void show() {
			//int i=10;
			System.out.println("Base");
		}
	}
	
	class Child extends Base1{
		
		
		
		public Child() {
			
			System.out.println("hi");
		}
		
		
		public  void disp() {
			System.out.println("disp");
		}
		int i=20;
			@Override
			public  void show() {
				System.out.println("Child");
			}
		}
		
	
	
	public class Inheritance {
	
	
	public static void main(String[] args) {
		Child c=new Child();
		c.show();
		c.disp();
		Base1 b1=new Base1();
		b1.show();

		Base1 b=new Child();
		
		//System.out.println(b.i);
		b.show();
		Child c1=(Child)b;
		c1.show();
		c1.disp();
		
		
		
	}
}
