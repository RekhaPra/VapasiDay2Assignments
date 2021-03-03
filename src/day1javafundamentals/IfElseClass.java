package day1javafundamentals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElseClass {
    // Check for number is less than 70
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Get the number as input
        System.out.println("Enter a number:");
        double checkMyNumber = scanner.nextDouble();
        if(checkMyNumber<70){
            System.out.println("Your number is less than 70");
        }else{
            System.out.println("Your number is greater than 70");
        }
        scanner.close();

    }


}
