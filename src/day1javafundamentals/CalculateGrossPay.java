package day1javafundamentals;

import java.util.Scanner;

public class CalculateGrossPay {
    public static void main(String[] args){
        /**Get no.of hours worked
         Calculate the daily wages
        Printout the salary value **/
        double perHourSalary = 500.50;
        System.out.println("Enter No.of hours worked:");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();
        double grossSalary = perHourSalary* hoursWorked;
        System.out.println("Gross Salary of an employee is"+grossSalary);



    }
}
