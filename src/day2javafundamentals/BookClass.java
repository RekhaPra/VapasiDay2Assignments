package day2javafundamentals;

public class BookClass {
    // Name
    //ISBN
    //Pages
    //Author
    public String name, author;
    public double isbn;
    public int pages;
    public static int noOfBooks;

    BookClass(){
       noOfBooks = noOfBooks + 1;
    }
    BookClass(String n,double ibn,int p, String a) {
        this.name = n;
        this.isbn = ibn;
        this.pages = p;
        this.author = a;
        noOfBooks = noOfBooks + 1;
    }

    void display(){
        System.out.println(name+" "+isbn+" "+pages+ author);
    }

}
