package datastructure;

import java.util.Hashtable;

public class HashTable{

    /**
     * SHow your understanding on HashTable
     * Use some methods from HashTable Class
     * */

    public static void main(String[] args) {
        //first insertion, serching
        //limited to size like array
        //can be resize but bit complicated
        // it is dificult to order
        //instand of going one by one it follow an algorithom to select a index,
        //suppose i have 10 data, if i need number 8 , it will go to 5 and compare if desire data bigger or smaller like that, thats how the surching is faster.
        Hashtable<Integer, String> name = new Hashtable<Integer, String>();
        name.put(1, "Rain");
        name.put(2,"Book");
        name.put(3,"Tea");

        System.out.println(name);

        System.out.println(name.size());

        System.out.println(name.contains("Tea"));


    }

   
}
