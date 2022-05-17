package kyu7;

public class ExesandOhs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Check to see if a string has the same amount of 'x's and 'o's. The method
		 * must return a boolean and be case insensitive. The string can contain any
		 * char.
		 * 
		 */
		System.out.println(getXO("ooxx"));
		System.out.println(getXO("xooxx"));
		System.out.println(getXO("ooxXm"));
		System.out.println(getXO("zpzpzpp"));
		System.out.println(getXO("zzoo"));
		System.out.println(getXO("xxxooo"));

	}

	public static boolean getXO(String str) {
		int amountO = 0;
		int amountX = 0;
		for (char c : str.toCharArray()) {
			if (c == 'o' || c == 'O') {
				amountO++;
			} else if (c == 'x' || c == 'X') {
				amountX++;
			}
		}
		return amountO == amountX;

	}
	
	/*
	 * Solution liked
	 * 
	 */
//	  public static boolean getXO (String str) {
//		    str = str.toLowerCase();
//		    return str.replace("o","").length() == str.replace("x","").length();
//		    
//		  }
//		}

}
