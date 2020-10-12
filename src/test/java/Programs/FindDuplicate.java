package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
	
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {4,2,4,5,2,3,4,5,2,5,4,3,8,9,7,8,3,7,9};
		
		int size=arr.length;
		//int result[]=new int[size];
		ArrayList<Integer> seenBeforeList = new ArrayList<>();
		
		
		for(int i=0;i<size;i++) {
			
			for(int j=i+1;j<size;j++) {
				if(arr[i]!=arr[j] && !seenBeforeList.contains(arr[i])) {
					
					seenBeforeList.add(arr[i]);
				}
				
				
				
		
		
			}		
				
			
		}
		
		System.out.println(seenBeforeList);	
	}}
		
		
		
		
		

