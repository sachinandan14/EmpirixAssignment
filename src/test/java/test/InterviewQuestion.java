package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class InterviewQuestion {
	
	
	
	
	
	 public static void main(String[] args) 
	  
	  { 
		 
		 int temp;
		  
		 int arr[]= {1,2,5,6,8,4,9};
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 for(int j=i+1;j<arr.length;j++) {
				 
				 if(arr[i]>arr[j]) {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
					 
				 }
				 
			 }
		 }
		  
		 for(int i=0;i<arr.length;i++) {
			 
			 
			 System.out.println(arr[i]);
		}
		  
	  
	  }
	
}
		 
	
	
	
	
	

	
	
	
		
	
		
		


		
	
	
	
	
