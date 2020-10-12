package Programs;

public class CountOfTextInString_CapitalQA {
	
	

		
		
		public static void main(String[] args) {
			
			/*
			 * String s="bbaaccaa"; String arr1[]= s.split("a", -1);
			 * 
			 * System.out.println(arr1.length);
			 */
			
			String text = "sampletestworldtestaaaaaatestddddtest";
			String str="test";
			int count=countMatches(text, str);
			System.out.println(count);
			
			
			
		}
		
		public static  boolean isEmpty(String s) {
			
			return s==null||s.length()==0;
		}
		
		
		
		public static int countMatches(String text,String str) {
			
			if(isEmpty(text)||isEmpty(str)) {
				
				return 0;
			}
			
			return text.split(str,-5).length-1;
		}
			
			}



