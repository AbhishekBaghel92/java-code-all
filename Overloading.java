public class Overloading {
    int multiply(int a, int b) { return a * b; }
    int multiply(int a, int b, int c) { return a * b * c; }
    double multiply(double a, double b) { return a * b; }

    public static void main(String[] args) {
        Overloading m = new Overloading();
        System.out.println(m.multiply(2, 3));
        System.out.println(m.multiply(2, 3, 4));
        System.out.println(m.multiply(2.5, 4.0));
    }
}
