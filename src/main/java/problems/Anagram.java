package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String str1 = "CAT";
        String str2 = "ACT";
        //String str1 = "is ARMY";
        // String str2 = "is MARY";

        System.out.println("String 1: " + str2);
        System.out.println("string2: " + str2);

        str2 = str2.replace(" ", "");
        str2 = str2.replace(" ", "");

        char char1[] = str2.toLowerCase().toCharArray();
        char char2[] = str2.toLowerCase().toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        boolean result = Arrays.equals(char1, char2);



        if (result == true) {
            System.out.println(" String 1 and String 2 are anagram");
        } else {
            System.out.println(" String 1 and String 2 are not anagram");
        }
    }
    }


