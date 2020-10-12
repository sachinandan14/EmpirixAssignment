package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QACapital {


	public static void main(String[] args) {


		String[] arr = {"Test", "Test1", 
				"Test2", "Test3"}; 


		List<String> al = Arrays.asList(arr);  

		/*
		 * al.add("test5"); al.add("test6"); through an exception unsupported exception
		 */

		//create new arraylist then add all element
		ArrayList<String> list=new ArrayList<String>();
		//add all element
		list.addAll(al);
		list.add("Test5");
		list.add("Test6");

		System.out.println(list);

		System.out.println(al);
	}
}
