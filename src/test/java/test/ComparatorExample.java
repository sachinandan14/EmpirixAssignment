package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(123);
		list.add(191);
		list.add(586);
		list.add(197);
		list.add(178);
		//list.add(197);

		System.out.println("Before Sorting"+list);
		Collections.sort(list);

		System.out.println("After Sorting"+list);

		//Using Comparator interface

		Comparator<Integer> com=new ComparatorImpl();
		Collections.sort(list, com);

		System.out.println("After Sorting"+list);

		//Using Anonymous class
		Comparator<Integer> com1=new ComparatorImpl()
		{		
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1%10>o2%10) {
					return 1;
				}
				return -1;
			}
		};

		Collections.sort(list, com1);
		//Using Lamda expression

		Comparator<Integer> comLamda=( o1,  o2)-> {
			if(o1%10>o2%10) {
				return 1;
			}
			return -1;
		}
		;

		Collections.sort(list, comLamda);
		System.out.println("After Sorting using lamda exp"+list);



		//Using ternary operator

		Comparator<Integer> comTern=( o1,  o2)-> {
			return o1%10>o2%10?1:-1;
		}
		;

		Collections.sort(list, comTern);
		System.out.println("After Sorting using lamda exp"+list);
		for(int i:list) {
			System.out.println(i);
		}
		

	}



}



