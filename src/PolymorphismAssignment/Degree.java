package PolymorphismAssignment;

public class Degree {
    //Create a class 'Degree' having a method 'getDegree' that prints "I got a degree".
    // It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a
    // method with the same name that prints "I am an Undergraduate" and "I am aPostgraduate" respectively.
    // Call the method by creating an object of each of the three classes
    public void getDegree() {
        System.out.println("I got a degree");
    }
}

class UnderGraduate extends Degree {
    public void getDegree() {
        System.out.println("I got a UnderGraduate degree");
    }
}

class PostGraduate extends Degree {
    public void getDegree() {
        System.out.println("I got a PostGraduate degree");
    }
}

class Student {
    public static void main(String[] args) {
        Degree degree = new Degree();
        degree.getDegree();
        UnderGraduate ug = new UnderGraduate();
        ug.getDegree();
        PostGraduate pg = new PostGraduate();
        pg.getDegree();
    }
}
