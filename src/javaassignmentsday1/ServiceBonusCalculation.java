package javaassignmentsday1;

import java.util.Scanner;

public class ServiceBonusCalculation {
    public  static void main(String[] args){
        //A company decided to give bonus of 5% to employee, if his/her year of service is more than 5 years.
        // Ask user for their salary and year of service and print the net bonus amount.
        int yearOfService;
        double salary;
        double percentage;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        salary = scanner.nextDouble();
        System.out.println("Enter your Year of service: ");
        yearOfService = scanner.nextInt();
        scanner.close();
        percentage = (5*salary)/100;
        if (yearOfService>5){
            System.out.println("Your net bonus amount is: " + percentage);
        }else{
            System.out.println("You don't have bonus amount");
        }


    }
}
