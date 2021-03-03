package day1javafundamentals;

import java.util.Scanner;

public class LogicalRelationalOperations {
    public static void main(String[] args){
        // Getting three numbers as input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int numA = scanner.nextInt();
        System.out.println("Enter number 2 :");
        int numB = scanner.nextInt();
        System.out.println("Enter number 3 :");
        int numC = scanner.nextInt();
        scanner.close();
        if(numA > numB && numA>numC){
            System.out.println("Number A is greater");
        }else if(numB>numA && numB>numC){
            System.out.println("Number B is greater");
        }else if (numC > numA && numC > numB){
            System.out.println("Number C is greater");
        }else
            System.out.println("Numbers are same");


    }
}
