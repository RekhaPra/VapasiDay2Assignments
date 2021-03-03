package javaassignmentsday1;

import java.util.Scanner;

public class StudentsAllowedToSitInClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double class_held, class_attended, percentage;
        System.out.println("Enter the number of classes held: ");
        class_held = scanner.nextDouble();
        System.out.println("Enter the number of classes attended: ");
        class_attended = scanner.nextDouble();
        scanner.close();
        percentage = ((class_attended / class_held) * 100);
        System.out.println("Attendance percentage is : " + percentage + "%");
        if (percentage > 75) {
            System.out.println("You are allowed to sit for exam");
        } else System.out.println("You are not allowed to sit for exam");


    }
}
