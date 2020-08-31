package problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /**
         *If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
         * Palindrome. So write java code to check if a given String is Palindrome or not.
         *
         **/
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome("MOM");
    }
    public boolean isPalindrome(String word) {
        String reverseString = "";
        int length =  word.length();
        for(int i =length-1; i>=0; i--){
            reverseString = reverseString + word.charAt(i);
        }
        boolean result;
        if(word.equalsIgnoreCase(reverseString)){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }


    }

