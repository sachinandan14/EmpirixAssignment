package test;

public class Singleton {
	
	private static Singleton instance=null;
	public String s;
	
	private Singleton() {
		
		s="Singleton test";
	    
		
	
	}
	
	
	private static Singleton getInstatnce() {
		
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		
		
		Singleton x=Singleton.getInstatnce();
		Singleton y=Singleton.getInstatnce();
		
		x.s=(x.s).toUpperCase();
		
		
		System.out.println(x.s);
	}

}
