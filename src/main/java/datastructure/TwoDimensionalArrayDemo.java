package datastructure;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TwoDimensionalArrayDemo {

    /**
     * @author Jahidul Islam
     * Construct Two Dimensional array reference variable and
     * store all the data of testData.xlsx from data directory
     * You do not have to read xlsx file only the similar data need to be
     * stored in 2D Array reference variable
     * Later get those value by index and also by using any iteration process
     *
     *  */
    public static void main(String[] args) throws FileNotFoundException {

            int[][] num2 = new int[3][3];
            num2[0][0] = 0;
            num2[0][1] = 1;
            num2[0][2] = 2;
            num2[1][0] = 3;
            num2[1][1] = 4;
            num2[1][2] = 5;
            num2[2][0] = 6;
            num2[2][1] = 7;
            num2[2][2] = 8;

        System.setOut(new PrintStream(new FileOutputStream("testData.xlsx")));

            for(int row=0; row<3; row++){
                for(int colum =0; colum <3; colum++){
                    System.out.print("   " + num2[row][colum]);
                }
                System.out.println();
            }



    }
}


