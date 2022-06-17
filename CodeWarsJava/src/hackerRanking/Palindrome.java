package hackerRanking;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String reverse = "";
        char ch;
        Scanner sc=new Scanner(System.in);
        String A=sc.next();        
        /* Enter your code here. Print output to STDOUT. */
        for(int i = 0; i < A.length(); i++){
            ch = A.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println(reverse);
        System.out.println(A.equalsIgnoreCase(reverse) ? "Yes":"No");

	}

}
