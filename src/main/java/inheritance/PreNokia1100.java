package inheritance;

public abstract class PreNokia1100 implements SymbianPhone {

    /**
     *
     * Implement interface SymbianPhone
     * Make necessary changes to make this class abstract
     *
     * Think Nokia company is planning to add a colorful display in future
     * but they cant implement that feature now. This implementation can be done by display()
     * Declare and assign value to a String instance variable called nameOfTheClass
     *
     *
     * */

    public void sendText() {
        String text = "Fatema, go to sleep, your batery almost down, 4 night without sleep...";
        System.out.println(text);
    }

    public void makeCall(){
        System.out.println("calling....");
    }
    public abstract void display();
//Declare and assign value to a String instance variable called nameOfTheClass >> whats that mean?
}
