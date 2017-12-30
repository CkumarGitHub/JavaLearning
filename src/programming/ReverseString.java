package programming;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		StringBuffer sbf=new StringBuffer(str);
		String revstr=sbf.reverse().toString();
		System.out.println(revstr);
		
		scan.close();
		
		
		
	}

}
