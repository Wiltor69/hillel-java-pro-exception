package hillel;


import hillel.exeption.ArrayDataException;
import hillel.exeption.ArraySizeException;

public class ArrayValueCalculator {

    public  int doCalc (String [][]strings) throws ArraySizeException, NumberFormatException,
            ArrayDataException {

        int sum = 0;

        if (strings.length > 4 || strings[0].length > 4) {
            throw new ArraySizeException("The number of elements exceeds the size.");
        } else
        try {
            for (int i = 0; i < strings.length; i++) {
                for (int j = 0; j < strings[0].length; j++) {

                    sum += Integer.parseInt(strings[i][j]);

                }
            }
            return sum;
        }catch (NumberFormatException nf){
            throw new ArrayDataException("This element is not number");
        }
        }

    }




