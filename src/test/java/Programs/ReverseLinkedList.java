package Programs;

import java.util.LinkedList;
import java.util.function.Consumer;

public class ReverseLinkedList {
	
	
	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("Sachin");
		list.add("Hello");
		list.add("Java");
		
		System.out.println(list);
		
		for(int i=list.size()-1;i>=0;i--) {
			
			System.out.println(list.get(i));
		}
		
		
		
	}

}
