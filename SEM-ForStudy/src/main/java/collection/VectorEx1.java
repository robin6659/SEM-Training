package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String args[]){  
		Vector<String> v=new Vector<String>();

		v.add("Samsung");
		v.add("Apple");
		v.add("Google");
		v.add("Samsung");
		v.add("Nokia");

		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
	}

}