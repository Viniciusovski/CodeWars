package hackerRanking;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
    static boolean isAnagram(String a, String b) {
        // Complete the function
    	boolean result = false;
    	String str1 = a.toLowerCase();
    	String str2 = b.toLowerCase();
    	
    	// check if length is same
    	if(str1.length() == str2.length()) {
    		// convert strings to char array
    		char[] charArray1 = str1.toCharArray();
    		char[] charArray2 = str2.toCharArray();
    		
    		// sort the char array
    		Arrays.sort(charArray1);
    		Arrays.sort(charArray2);
    		
    		// if sorted char arrays are same
    		// then the string is anagram
    		result = Arrays.equals(charArray1, charArray2);
    	}
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}
