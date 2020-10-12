package Programs;

import org.testng.annotations.Test;

public class MissingNo {


	@Test
	public  void missingNoTest() {

		// given input 
		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
		// let's create another array with same length // by default all index will contain zero // default value for int variable 
		int[] register = new int[input.length];
		// now let's iterate over given array to // mark all present numbers in our register // array 
		for (int i : input) 
		{ 
			register[i] = 1; }
		// now, let's print all the absentees
		System.out.println("missing numbers in given array"); 
		for (int i = 1; i < register.length; i++) 
		{
			if (register[i] == 0) { System.out.println(i); 

			}
		}
	}




	@Test
	public  void missingNoTest2() {

		// given input 
		int[] input = { 1, 2, 3, 5, 6,7,8,9 };
		// let's create another array with same length // by default all index will contain zero // default value for int variable 
		int sum=0;
		// now let's iterate over given array to // mark all present numbers in our register // array 
		for (int i=0;i<input.length;i++) 
		{ 
			sum=sum+input[i];
			// now, let's print all the absentees
			

		}
		System.out.println("Sum is : "+sum);
		
		int sum1=0;
		for (int j=1;j<=9;j++) 
		{ 
			sum1=sum1+j;
			// now, let's print all the absentees
			
			

		}
		System.out.println("Sum1 is: "+sum1);
		System.out.println("missing numbers in given array"); 
		System.out.println(sum1-sum);
	}}


