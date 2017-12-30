package OOPSConcepts;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {

		ArrayList a= new ArrayList();
		a.add("Chandan");
		a.add(100);
		a.add(12.33);
		System.out.println(a.size());
		
		System.out.println(a.get(2));
		
		ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(1000);
		
	}

}
