package javaassignmentsday1;

import java.util.Scanner;

public class AbsoluteValueOfNumber {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        a= scanner.nextInt();
        //Absolute Value
        a = Math.abs(a);
        System.out.println("The absolute value of the number is " + a);

    }

}
