package test;

import org.testng.annotations.Test;

public class LinkedList {
	
	
	@Test
	public void linkedListTest() {
		
		java.util.LinkedList<String> ll=new java.util.LinkedList<String>();
		
		ll.add("Sachin");
		ll.addFirst("Selenium");
		ll.addLast("Java");
		
	
		
		
		ll.set(0, "Automation");
		
		ll.remove(2);
		
		System.out.println(ll);
	}

}
