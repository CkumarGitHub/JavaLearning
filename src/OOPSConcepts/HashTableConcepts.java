package OOPSConcepts;

import java.util.Hashtable;

public class HashTableConcepts {

	public static void main(String[] args) {

		Hashtable h= new Hashtable();
		
		h.put("A", "Chandan");
		h.put(1, 200);
		
		Hashtable<Integer,Integer> h1= new Hashtable<>();
		h1.put(2, 200);
		// h1.put(2, "value");
	}

}
