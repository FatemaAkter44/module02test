package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * You can use any other retrieval process
		 * Use any databases[ Postgresql] to store data and retrieve data.
		 */

		map();
		hashmap();
	}


	public static void map(){
		Map<String,String> name=new HashMap<>();

		name.put("1","Fatema");
		name.put("2","Ayesha");
		name.put("3","Mahdi");

		System.out.println(name.size());

		System.out.println(name.get("3"));

		for(Map.Entry <String,String> entry:name.entrySet()){
			System.out.println("roll: "+ entry.getKey()+"  name: "+ entry.getValue());
		}

	}

	public static void hashmap(){
		HashMap<String,String> name=new HashMap<>();

		name.put("1","Fatema");
		name.put("2","Ayesha");
		name.put("3","Mahdi");
		name.put("3", "Fatema"); // duplicate value will not take

		System.out.println(name.size());

		System.out.println(name.get("3"));

		for(Map.Entry <String,String> entry:name.entrySet()){
			System.out.println("roll: "+ entry.getKey()+"  name: "+ entry.getValue());
		}

		name.remove("2");
		System.out.println(name);

		// save to postgress !!! :(
	}

}
