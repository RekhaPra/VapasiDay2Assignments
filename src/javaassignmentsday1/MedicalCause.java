package javaassignmentsday1;

import java.util.Scanner;

public class MedicalCause {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char medicalCause;
        System.out.println("Enter if you have any medical cause,say Y or N : ");
            medicalCause = scanner.next().charAt(0);
            if(medicalCause == 'y')
                System.out.println("You are not allowed to sit for exam");
            else System.out.println("You are allowed to sit for exam");

    }
}
