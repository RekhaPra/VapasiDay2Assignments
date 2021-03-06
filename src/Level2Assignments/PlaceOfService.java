package Level2Assignments;

import java.util.Scanner;

public class PlaceOfService {
    //Ask user to enter age, sex ( M or F ), marital status( Y or N )
    //if employee is female, then she will work only in urban areas.
    // if employee is a male and age is in between 20 to40 then he may work in anywhere
    // if employee is male and age is in between 40 t0 60, then he will work in urban areas only.
    // And any other input of age should print "ERROR
    public static void main(String[] args) {
        int age;
        String sex;
        String maritalStatus;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        System.out.println("Enter your sex(M or F): ");
        sex = scanner.next();
        System.out.println("Enter your marital status (Y or N): ");
        maritalStatus = scanner.next();
        if (age < 20 || age > 60)
            System.out.println(" Age ERROR");
        if ((sex.equalsIgnoreCase("f"))) {
            System.out.println("Works in urban area");
        } else if (sex.equalsIgnoreCase("M")) {
            if (age > 20 && age < 40) {
                System.out.println("Works in urban area");
            } else if(age > 40 && age < 60) {
                System.out.println("Works in urban area");
            }
        } else
            System.out.println("Invalid sex/marital status");
    }

}
