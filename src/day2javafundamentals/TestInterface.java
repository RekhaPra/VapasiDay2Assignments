package day2javafundamentals;

public class TestInterface {
    public static void main(String args[]) {
        History history = new History();
        Math math = new Math();
        Novel novel = new Novel();
        history.read();
        history.writeAuthorName();
        math.read();
        math.writeAuthorName();
        novel.read();
        novel.writeAuthorName();

    }
}
