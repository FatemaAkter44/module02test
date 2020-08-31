package api;

public class StringAPI {

    /**
     * @author Jahiudl Islam
     * Read String JDK 8 API documantation to be read and String source code to be viewed
     * Demonastrate your understanding on String after reading the documentation
     * You are free to document your understanding using comment
     * Reason to comment is to keep documentation so that next developer can get highlevel understaning of your implementation
     * by reading your comments/documents
     *
     * */

    //String is a sequeence of carecter, constant, String is a class, difftrnt than other data type.
    // we can make object of it using new kew worrd.
    // we can use it as a array which mean we can get what ever we need using the index
    // there is many inbuilt methodes to manupulate String data,
    public static void main(String[] args) {
        String name ="Fatema";
        String name1 =name.toUpperCase();
        System.out.println(name1);

        int size = name.length();
        System.out.println(size);


    }
}
