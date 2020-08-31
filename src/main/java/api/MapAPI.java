package api;

import org.apache.poi.xssf.binary.XSSFBUtils;

import java.util.HashMap;
import java.util.Map;

public class MapAPI {
    /**
     * @author Jahiudl Islam
     * Read Map and HashMap JDK 8 API documantation to be read and Map and HashMap source code to be viewed
     * Demonastrate your understanding on Map and HashMap after reading the documentation
     * You are free to document your understanding using comment
     * Reason to comment is to keep documentation so that next developer can get highlevel understaning of your implementation
     * by reading your comments/documents
     *
     * */
    //map is a data structure like stack, queue, linked list, tree, but it is not a part og collection interface because it work with key and value that is diffent then others.
    // mape stre as a key and valur
    //key have to be eunique but value can have duplicte
    //we can find if the string has all unique character
    //we can find all non repeted character in a string
    //we can find maximum ouring character
    //print duplicate carecter in a string
    //remove duplicte carecter easily
    //for each loop is more suitable for map
    //we have to use data.get() and data.put() to adding in map.
    //it store the key in a order
    public void stringToHashMap() {
        String name = "ayesha";
        char nameToChar[] = name.toCharArray();
        int size = nameToChar.length;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int i = 0;
        while (i != size){
            if(map.containsKey(nameToChar[i]) == false){
                map.put(nameToChar[i],1);
            } else
            {
                int oldValue = map.get(nameToChar[i]);
                int newValue = oldValue+1;
                map.put(nameToChar[i], newValue);
            }
            ++i;
        }
//        for(Map.Entry<Character, Integer> data : ){
//
//       }

    }

    public static void hashmapPractice(){
        HashMap <String, String> fun = new HashMap<>();
        fun.put("User1", "Fatema");
        fun.put("user2", "Ayesha");
        fun.put("user1", "Fatema"); //taking the value because u is lower case
        fun.put("User1","Mahdi"); //it will not take becaue key can not be duplicate
        System.out.println(fun);

        fun.remove("user1");
        System.out.println(fun);

        System.out.println(fun.containsKey("user2"));
        System.out.println(fun.size());

    }

    public static void main(String[] args) {
        hashmapPractice();
    }
}