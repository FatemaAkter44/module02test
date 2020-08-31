package inheritance;

public interface SymbianPhone {

    /**
     *
     * Assume that this is early stage of creating mobile
     *
     * Declare 3 methods sendText(), makeCall(), contactList()
     * Can a method contains method body in Interface?
     * Ans: yes from java 8, with a a default key word we can use a method body in interface
     *
     * */

    public void sendText();

    public void makeCall();
    default public void contactList(){
        String name ="Fatema";
        System.out.println("calling " + name);
    }
}
