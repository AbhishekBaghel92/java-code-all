class Shape {
    String color;
    Shape(String color) { this.color = color; }
    void info() { System.out.println("Color: " + color); }
}
class Circle extends Shape {
    double radius;
    Circle(String color, double radius) { super(color); this.radius = radius; }
    void area() { System.out.println("Circle area: " + (3.14 * radius * radius)); }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(String color, double l, double w) { super(color); length = l; width = w; }
    @Override
    void info() { super.info(); System.out.println("Rectangle area: " + (length * width)); }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5);
        c.info();
        c.area();
        new Rectangle("Blue", 4, 6).info();
    }
}
