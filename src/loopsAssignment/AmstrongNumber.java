package loopsAssignment;

public class AmstrongNumber {
    public static void main(String[] args) {
        int number;
        int total = 0;
        System.out.println("Armstrong numbers are");
        int value;
        for (int i = 1; i < 1000; i++) {
            number = i;
            value = i;
            while (number > 0) {
                int n = number % 10;
                total = total + (n * n * n);
                number = number / 10;

            }
            if (value == total)
                System.out.println(i);
            total = 0;
        }
    }
}
