package javaassignmentsday1;

import java.util.Scanner;

public class UserInputSumAndProduct2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();
        scanner.close();
        int sum = num1+num2;
        int product = num1*num2;
        System.out.println("The Sum of two numbers is : "+ sum);
        System.out.println("The Product of two numbers is : "+ product);
    }
}
