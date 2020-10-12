package test;

public class SegregateElement {
	
    
    public static void main(String[] args) {
    	
    	int arr[]= {0,1,0,1,1,1,0,1,0,1,1};
    	int size=arr.length;
    	
    	int count = 0; // counts the no of zeros in arr 
		
    	for (int i = 0; i < arr.length; i++) { 
            if (arr[i] == 0) 
                count++; 
        } 
    	
    	
    	int Result[] = new int[size];
    	
    	for (int i = 0; i < count; i++) {
    		Result[i] = 0;
    		
    		System.out.println(Result[i]);
	}
    	
    	 for (int i = count; i < size; i++) {
    		 Result[i] = 1; 
     } 
    	 
    	 System.out.print("Array after segregation is "); 
         for (int i = 0; i < size; i++) 
             System.out.print(Result[i] + " ");   
    	
    }
    
    
}
