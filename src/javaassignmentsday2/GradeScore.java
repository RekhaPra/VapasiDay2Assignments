package javaassignmentsday2;

import java.util.Scanner;

public class GradeScore {
    //Write a program that allows user to enter number of grades(out off 100) and
    // provide them with their average,highest & lowest score
    // Example: Number of grades : 4User enters: 50, 78, 69,55Average : 63Highest: 78Lowest : 50
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of grades:");
        int numberOfGrades = scanner.nextInt();
        double[] grades = new double[numberOfGrades];
        double total = 0.0;
        double max = 0.0;
        double min = Double.MAX_VALUE;
        //Loop through all of the grades.
        for(int i = 0; i < 100; i++){
            double grade = grades[i];
            //Add the grade to the total
            total += grade;
            //If this is the highest grade we've encountered, set as the max.
            if(max < grade){
                max = grade;
            }
            //If this is the lowest grade we've encountered, set as min.
            if(min > grade){
                min = grade;
            }
        }

        System.out.println("Average is: " + (total / 100));
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }

}
