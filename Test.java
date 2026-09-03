
package OOPS.Polymorephism;

class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {
    @Override
    public void area() {
        int h = 10;
        int b = 5;
        System.out.println("Area of Triangle = " + (0.5 * h * b));
    }
}

class Circle extends Shape {
    @Override
    public void area() {
        int r = 5;
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }
}

public class Test {
    public static void main(String[] args) {

        Shape s;

        s = new Triangle();
        s.area();

        s = new Circle();
        s.area();
    }
}

