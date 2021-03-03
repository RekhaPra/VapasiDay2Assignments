package javaassignmentsday1;

import java.util.Scanner;

public class OldestAndYoungestOfThree {
    public static void main(String[] args) {
        int oldestPerson, youngestPerson, personOneAge, personTwoAge, personThreeAge;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Person One Age:");

        personOneAge = scanner.nextInt();

        System.out.println("Enter Person Two Age:");

        personTwoAge = scanner.nextInt();

        System.out.println("Enter Person Three Age:");

        personThreeAge = scanner.nextInt();

        if ((personOneAge > personTwoAge) && (personOneAge > personThreeAge))

            System.out.println("Person One is the Oldest Person");

        else if ((personTwoAge > personOneAge) && (personTwoAge > personThreeAge))

            System.out.println("Person two is the Oldest Person");

        else if ((personThreeAge > personOneAge) && (personThreeAge > personTwoAge))

            System.out.println("Person Three is the Oldest Person");
        else
            System.out.println("Age is same");

        if ((personOneAge < personTwoAge) && (personOneAge < personThreeAge))

            System.out.println("Person One is the Youngest Person");

        else if ((personTwoAge < personOneAge) && (personTwoAge < personThreeAge))

            System.out.println("Person Two is the Youngest Person");

        else if ((personThreeAge < personOneAge) && (personThreeAge < personTwoAge))

            System.out.println("Person Three is the Youngest Person");

        else

            System.out.println("Age is same");


    }

}

