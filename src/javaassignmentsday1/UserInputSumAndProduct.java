package javaassignmentsday1;

import java.util.Scanner;

public class UserInputSumAndProduct {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();
        scanner.close();
        System.out.println("The Sum and Product of two numbers is : "+ (num1+num2) + ", "+ (num1*num2)+" respectively" );
    }
}
