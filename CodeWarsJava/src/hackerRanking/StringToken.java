package hackerRanking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		// Write your code here.
		if(s.length() > 0) {
			String[] tokens = s.split("[!,?._'@\\s]+");
			System.out.println(tokens.length);
			
			for (String string : tokens) {
				System.out.println(string);
			}			
			
		}else {
			System.out.println(0);
		}

		scan.close();

	}

}
