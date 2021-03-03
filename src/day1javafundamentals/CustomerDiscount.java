package day1javafundamentals;

import java.util.Scanner;

public class CustomerDiscount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is today your birthday:");
        String bday = scanner.next();
        System.out.println("Enter your order value:");
        int orderValue = scanner.nextInt();
        if (orderValue>=1000 && bday.equals("yes")){
            System.out.println("You can avail 10% discount");
        }else
            System.out.println("You cannot avail 10% discount");

    }
}
