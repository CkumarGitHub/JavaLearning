package datatypedemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
//import java.util.Iterator;
import java.util.ArrayList;

public class HastSetDemo {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> value=new LinkedHashSet<String>();
		value.add("Chandan");
		value.add("Kumar");
		value.add("1");
		value.add("Shiv");
		value.add("Shankar");
		value.add("376627");
		
		ArrayList<String> list = new ArrayList<String>(value);
		System.out.println(list.get(3));
		
		
		
	}

}
