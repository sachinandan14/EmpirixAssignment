package test;

public class Arrays {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * String arr[]= {"a","d","j"};
		 * System.out.println(java.util.Arrays.deepToString(arr));
		 * System.out.println(java.util.Arrays.toString(arr)); Thread.sleep(2000);
		 * Object obj=new Object(); obj.wait(10); System.out.println("gdfd");
		 * System.out.println(" ");
		 */
		
		int[] arr= {1,2,4,7,10,11,77,77,88,0};
		int size =arr.length;
		int largest=arr[0];
		int secondLargest=arr[0];
		
		for(int i=0;i<size;i++) {
			
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
				
			}else if(arr[i] > secondLargest && arr[i] != largest){
				secondLargest=arr[i];
				
			}
			
		}
		
			System.out.println(largest);
			System.out.println(secondLargest);
			
		}
		
		 
		
		
	}


