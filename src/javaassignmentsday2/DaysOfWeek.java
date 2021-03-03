package javaassignmentsday2;

import java.util.Scanner;

public class DaysOfWeek {
    //Make array that holds texual value of days like “Monday, Tuesday etc
    // Let use input corresponding day
   // Program should output String that represent day and you can assume week start Monday
    public static void main(String[] args){
        String daysOfWeek[] = {"Monday","Tuesday","Wednesday", "Thursday", "Friday","Saturday","Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number for which you want to display the day string: ");
        int dayNum = scanner.nextInt();
        if(dayNum<=0|| dayNum>=7){
            System.out.println("Enter a valid day number");
        }else{
            System.out.println(daysOfWeek[dayNum-1]);
        }
    }
}
