package Level2Assignments;

import java.util.Scanner;

public class LeapYear {

    //Write a program to check if a year is leap year ornot.
    //If a year is divisible by 4 then it is leap year
    // but if the year is century year like 2000, 1900, 2100 then itmust be divisible by 400

    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year : ");
        year = scanner.nextInt();
        //Leap year
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            System.out.println("Given year is a leap year");
        }else{
            System.out.println("Given year is not 19a leap year");
        }


    }
}
