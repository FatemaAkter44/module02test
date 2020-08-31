package inheritance;

public class CallingMethods extends Nokia1100 {
    public static void main(String[] args) {
        Nokia1100 nokia1100 = new Nokia1100();
        nokia1100.display();
        nokia1100.photoGalary();
        nokia1100.contactList();
        nokia1100.sendText();
    }
}
