package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {

		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		//list can add null value, and dublicate value
		ArrayList<String> name = new ArrayList<String>();
		System.out.println("the size of arraylist in beginning : "+ name.size());
//adding value one by one
		name.add("Love");
		name.add("Hate");
		name.add("Life");
		System.out.println(name);

		for(String x: name){
			System.out.println("See the difference between normal print and for each: " + x);
		}



		//using Iterator
		Iterator ite = name.iterator();
		while (ite.hasNext()){
			System.out.println("Print using Iterator: " + ite.next());
		}
		System.out.println(" after adding 3 name: "+name.size());

		name.remove("life");
		name.set(2, "AfterLife");
		System.out.println(name);

	}

}
