package day2javafundamentals;

import java.awt.print.Book;

public class ApplicationClass {
    public static void main(String args[]){
        //calling a default constructor
        BookClass bookclass = new BookClass();
        BookClass bookclass1 = new BookClass();
        BookClass bookclass2 = new BookClass();
        BookClass bookclass3 = new BookClass();
        //String n,double ibn,int p, String a
        BookClass bc1 = new BookClass("HarryPotter",68676,200,"Rekha");
        BookClass bc2 = new BookClass("StoryBook",686878,80,"Rihh");
        System.out.println("No.of book so far created:"+ BookClass.noOfBooks);


    }
}
