package javaassignmentsday1;

import java.util.Scanner;

public class LowerOrUpperCase {
    public static void main(String[] args){
        char testChar ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        testChar = scanner.next().charAt(0);
        scanner.close();
        if (testChar>='A' && testChar<='Z'){
            System.out.println("You have entered a uppercase character");
        }else if(testChar>='a' && testChar<='z'){
            System.out.println("You have entered a lowercase character");
        }else System.out.println("Enter a valid character");
    }
}
