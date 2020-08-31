package datastructure;

import java.util.HashMap;

public class MapDemo {

    /**
     * @author Jahidul Islam
     * Create a Map reference variable and store information as you like
     * Show me all possible retrieval process
     * Store map in DB
     *
     * */
    public static void main(String[] args) {
        HashMap<Integer, String> name = new HashMap<Integer, String>();
        name.put(1, "Allah");
        name.put(2, "Rahman");
        name.put(3, "Rohim");
        System.out.println(name);

        name.remove(3);
        System.out.println(name);

        for(int i : name.keySet()){
            System.out.println(i + "  " + name.get(i));
        }

        //how to add to db!!!



    }
}
