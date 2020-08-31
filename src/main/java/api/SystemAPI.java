package api;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SystemAPI {

    /**
     * @author Jahidul Islam
     * Read System JDK 8 API documantation to be read and System source code to be viewed
     * Demonastrate your understanding on System after reading the documentation
     * Show some uses of System Class
     * Explain, what is System.out.println()?
     * List all the members of the System class, such as class variable, instance variables, local variables
     * method type etc
     *
     * */

//
//System is a class in lang pakage
    // it contains usefull methods and class filed that can be instantiated( we can not use it withoud importing the libreries)
    //when we take an input then process it and see oputput
    //System calls is a defult constracter we can can create a object out of irt
    //it is an static member we can directly use it.
    //in, out, err are variavle in system class. static final variable , we can not change it.

    //System is a class, out is a refrence of java.io.Printstrem, println is a method
    //Syestem.err,println , it is used to display the error messege in the console

    //setI, setOut, setOut are methods to change implementation of input and output
    //
    public static void main(String[] args) throws FileNotFoundException {
        //System s = new System(); //we can create an object out of it
        System.out.println("hi i am fatema");


        System.err.println(" I am an error messege");

        //gc() is a garbej collector
        //exit(int) will exit jbmp

        System.setOut(new PrintStream(new FileOutputStream("testData.txt")));
        System.out.println("This is the text to writimng in the text file");
        System.out.println("i want to add something");
        System.err.println("This gonna display on consoul because i am only changing the output implementation");

    }
}
