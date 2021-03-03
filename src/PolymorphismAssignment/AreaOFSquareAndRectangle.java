package PolymorphismAssignment;

public class AreaOFSquareAndRectangle {
    public void printArea(int side){
        int area = side*side;
        System.out.println("Area of Square is :" + area);
    }
    public void printArea(int length, int breadth){
        int area = length*breadth;
        System.out.println("Area of Square is :" + area);
    }

    public static void main(String[] args){
        AreaOFSquareAndRectangle area = new AreaOFSquareAndRectangle();
        area.printArea(5);
        area.printArea(5,5);
    }

}
