package hillel;

import hillel.exeption.ArrayDataException;
import hillel.exeption.ArraySizeException;

public class Main {
    public static void main(String[] args) {
       try {
           ArrayValueCalculator ar = new ArrayValueCalculator();
           String[][] strings = {{"1", "9", "3", "4"}, {"5", "6", "7", "8"}};
           System.out.println("All sum is: " + ar.doCalc(strings));
       }
       catch (ArraySizeException ar){
           System.out.println(ar);
       }
       catch (ArrayDataException ad){
           System.out.println(ad);
       }
       catch (NumberFormatException nf){
           System.out.println(nf);
       }


    }

}
