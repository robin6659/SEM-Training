package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String args[]){

		TreeSet<String> set=new TreeSet<String>();
		
		set.add("Kawasaki");
		set.add("Yamaha");
		set.add("Aprilia");
		set.add("Ducati");

		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	} 
}