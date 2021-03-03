package PolymorphismAssignment;

public class PrintNumbers {
    //Create a class named 'PrintNumber' to print various numbers of different datatypes by
    //creating different methods with the same name 'println' having a parameter for each data type.
    public void println(int numInt){
        System.out.println("Printing the integer : " + numInt);
    }
    public void println(float numFloat){
        System.out.println("Printing the integer : " + numFloat);
    }
    public void println(double numDouble){
        System.out.println("Printing the integer : " + numDouble);
    }

    public static void main(String[] args){
        PrintNumbers printNumbers = new PrintNumbers();
        printNumbers.println(9);
        printNumbers.println(100.009);
        printNumbers.println(20.44f);
    }
}
