package loopsAssignment;

import java.util.Scanner;

public class BinaryPramidPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");

        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
