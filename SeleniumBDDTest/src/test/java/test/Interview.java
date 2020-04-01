package test;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Interview {
	
	
	
	
	public static void main(String[] args) {
		
		
		 Map<Integer, String> hmap = new HashMap<Integer, String>();
	      hmap.put(1, "Monkey");
	      hmap.put(2, "Dog"); 
	      hmap.put(3, "Cat");  
	      hmap.put(4, "Lion");   
	      hmap.put(5, "Tiger");   
	      hmap.put(6, "Bear");
	      /* forEach to iterate and display each key and value pair
	       * of HashMap.    
	       */  
	      hmap.forEach((key,value)->System.out.println(key+" - "+value));
	      System.out.println();
		
		
		
	}
	
	
	@Test
	public void longestPalindrome() {

				System.out.println(longestPalindromeString("abab"));
				//System.out.println(longestPalindromeString("12321"));
				//System.out.println(longestPalindromeString("forgeeksskeegfor"));
				//System.out.println(longestPalindromeString("9912333321456"));
				//System.out.println(longestPalindromeString("12145445499"));
				//System.out.println(longestPalindromeString("1223213"));
				//System.out.println(longestPalindromeString("abb"));
			}

			static public String intermediatePalindrome(String s, int left, int right) {
				if (left > right) return null;
				while (left >= 0 && right < s.length()
						&& s.charAt(left) == s.charAt(right)) {
					left--;
					right++;
				}
				return s.substring(left + 1, right);
			}

			// O(n^2)
			public static String longestPalindromeString(String s) {
				if (s == null) return null;
				String longest = s.substring(0, 1);
				for (int i = 0; i < s.length() - 1; i++) {
					//odd cases like 121
					String palindrome = intermediatePalindrome(s, i, i);
					if (palindrome.length() > longest.length()) {
						longest = palindrome;
					}
					//even cases like 1221
					palindrome = intermediatePalindrome(s, i, i + 1);
					if (palindrome.length() > longest.length()) {
						longest = palindrome;
					}
				}
				return longest;
			}

		
		

}






/* int n = str.length();   // get length of input string 

// table[i][j] will be false if substring str[i..j] 
// is not palindrome. 
// Else table[i][j] will be true 
boolean table[][] = new boolean[n][n]; 

// All substrings of length 1 are palindromes 
int maxLength = 1; 
for (int i = 0; i < n; ++i) 
    table[i][i] = true; 

// check for sub-string of length 2. 
int start = 0; 
for (int i = 0; i < n - 1; ++i) { 
    if (str.charAt(i) == str.charAt(i + 1)) { 
        table[i][i + 1] = true; 
        start = i; 
        maxLength = 2; 
    } 
} 
  
// Check for lengths greater than 2. k is length 
// of substring 
for (int k = 3; k <= n; ++k) { 
      
          // Fix the starting index 
    for (int i = 0; i < n - k + 1; ++i)  
    { 
        // Get the ending index of substring from 
        // starting index i and length k 
        int j = i + k - 1; 

        // checking for sub-string from ith index to 
        // jth index iff str.charAt(i+1) to  
        // str.charAt(j-1) is a palindrome 
        if (table[i + 1][j - 1] && str.charAt(i) ==  
                                  str.charAt(j)) { 
            table[i][j] = true; 

            if (k > maxLength) { 
                start = i; 
                maxLength = k; 
            } 
        } 
    } 
} 
System.out.print("Longest palindrome substring is; "); 
printSubStr(str, start, start + maxLength - 1); 
  
return maxLength; // return length of LPS 
} 

// Driver program to test above functions 
public static void main(String[] args) { 

String str = "forgeeksskeegfor"; 
System.out.println("Length is: " +  
                         longestPalSubstr(str)); 
} 
} */














