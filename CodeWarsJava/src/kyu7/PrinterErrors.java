package kyu7;

import java.util.Arrays;
import java.util.List;

public class PrinterErrors {
	
	public static void main(String[] args) {
		System.out.println(printerError("aaabbbbhaijjjm"));
;	
	}
	
    public static String printerError(String s) {
        // your code
    	return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    	
    }

}
