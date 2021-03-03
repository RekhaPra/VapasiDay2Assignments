package day2javafundamentals;

public class History implements Book,Book2 {

    public void read() {
        System.out.println("Reading history book");
    }
    public void writeAuthorName(){
        System.out.println("My author name is Anu");
    }
}
