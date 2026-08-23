class Shape {

    String color;

    Shape(String color) {
        this.color = color;
    }
}

class Circle extends Shape {

    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    void area() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

public class Main {

    public static void main(String[] args) {

        Circle c = new Circle("Red", 5);

        Rectangle r = new Rectangle("Blue", 10, 5);

        System.out.println("Circle Color: " + c.color);
        c.area();

        System.out.println("Rectangle Color: " + r.color);
        r.area();
    }
}