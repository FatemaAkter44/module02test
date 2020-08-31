package inheritance;

public class Nokia1100 extends PreNokia1100{

   /**
     * Make necessary changes to inherit PreNokia1100
     * Declare and assign value to a String instance variable called nameOfTheClass
     * Implement a method to add photo gallery photoGallery()
     * Create default constructor and a parameterized constructor with int x parameter
     * */
   String nameofTheClass ="Nokia1100";
   @Override
   public void display() {
      System.out.println("display ... ");
   }
   public void photoGalary(){
      System.out.println("Galary...");
   }

   public void Nokia1100(){
      System.out.println("I am default constractor.");
   }

   public  void Nokia1100(int x){
      System.out.println("I am parametarised constractor. ");
   }


   }
