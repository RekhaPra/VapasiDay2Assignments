package javaassignmentsday1;

public class AsciiEqivalentChar {
    public static void main(String[] args){
        char ch1= 'd';
        int asciiValue = ch1;
        int findAscii = asciiValue+3;
        char ch2 = (char) findAscii;
        System.out.println("Ascii Equivalent Character is :" + ch2);
    }
}
