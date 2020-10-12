package Programs;

import org.testng.annotations.Test;

public class SecondHighestNo {
	
	@Test
	public void test() {
		int largest = 0,secondLargest=0;
		
		int arr[]= {10,2,8,9,15,4};
		
		for(int i=0;i<arr.length;i++) {
		
		if(arr[i]>largest) {
			secondLargest=largest;
			
			largest=arr[i];
			
		}else if (arr[i]>secondLargest) {
			
			secondLargest=arr[i];
			
		}
		
		
	}
		
		System.out.println(secondLargest);
	}
}
