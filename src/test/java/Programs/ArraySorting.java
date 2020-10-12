package Programs;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {

	public static void main(String[] args) {

		int temp;

		Integer[] arr= {1,2,5,6,8,4,9};

		for(int i=0;i<arr.length;i++) {

			for(int j=i+1;j<arr.length;j++) {

				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

				}

			}
		}
		//Ascending order
		for(int i=0;i<arr.length;i++) {


			System.out.println(arr[i]);
		}

		//Decending order

		Arrays.sort(arr, Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {


			System.out.println("Decending Order:"+arr[i]);
		}

	}

}
