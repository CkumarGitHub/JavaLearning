package datatypedemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		obj1.add("Chandan");
		obj1.add("12.54");
		obj1.add("M");
		int arraylistsize = obj1.size();
		/*for (int i=0;i<arraylistsize;i++)
		{
			System.out.println(obj1.get(i));
		}*/
		//Enhanced For loop
		for (Object abc:obj1)
		{
			System.out.println(abc);
		}
		Iterator itr = obj1.iterator();
		while(itr.hasNext())
		{
			Object value = itr.next();
			System.out.println(value);
		}
	}

}
