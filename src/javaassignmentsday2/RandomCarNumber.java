package javaassignmentsday2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandomCarNumber {
    public static void main(String[] args){
        //Take input  from user for number of unique car number to generate
        // Take format of card number to be MH{Random4digits}: MH3459
        // Make sure number generated are not duplicate
        String[] carNumber = new String[5];
        String index;
        Random random = new Random();
        for (int i=0; i<5; i++){
            index = String.format("%04d", random.nextInt(1000));
            index = "MH"+ index;
            boolean test = Arrays.asList(carNumber).contains(index);
            if(!test){
                carNumber[i] = index;
                System.out.println("Car number is:"+ carNumber[i]);
            }
        }

    }
}
