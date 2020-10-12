package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class IterateArrayList {

	//TC1
	@Test
	public void testViaForLoop() {

		ArrayList<String> list=new ArrayList<String>(Arrays.asList("Sachin","Sourav","Kishlay"));

		for(int i=0;i<list.size();i++) {

			System.out.println(list.get(i));
		}

	}
	//TC2
	@Test
	public void testViaForEachLoop() {

		ArrayList<String> list=new ArrayList<String>(Arrays.asList("Sachin","Sourav","Kishlay"));

		for(String s:list) {

			System.out.println(s);
		}

	}

	//TC3
	@Test
	public void testViaListIterator() {

		ArrayList<String> list=new ArrayList<String>(Arrays.asList("Sachin","Sourav","Kishlay"));

		ListIterator<String> listItr=list.listIterator();

		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}


	}

	//TC4
	@Test
	public void testViaWhileLoop() {

		ArrayList<String> list=new ArrayList<String>(Arrays.asList("Sachin","Sourav","Kishlay"));

		int index=0;

		while(list.size()>index) {
			System.out.println(list.get(index++));
		}


	}
	//TC5
	@Test
	public void testWithLamdaExpr() {

		ArrayList<String> list=new ArrayList<String>(Arrays.asList("Sachin","Sourav","Kishlay"));


		list.forEach(name->System.out.println(name));


	}
	//TC6
	@Test
	public void testWithIterator() {

		ArrayList<String> list=new ArrayList<String>(Arrays.asList("Sachin","Sourav","Kishlay"));


		Iterator<String> itr=list.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


	}



}



