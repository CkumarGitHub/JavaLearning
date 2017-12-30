package datatypedemo;

import java.util.Scanner;

public class GettingInput {

		@SuppressWarnings("resource")
		public static void main(String[] args) {

		Scanner ck = new Scanner(System.in);
		int fnum,snum,sum;
		System.out.println("Enter the first no:");
		fnum=ck.nextInt();
		System.out.println("Enter the first no:");
		snum=ck.nextInt();
		sum=fnum+snum;
		System.out.println("Sum is "+sum);

	}

}
