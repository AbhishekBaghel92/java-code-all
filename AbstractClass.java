abstract class Bank {
    abstract double getROI();
    void welcome() { System.out.println("Welcome to the bank"); }
}
class SBI extends Bank { double getROI() { return 7.0; } }
class HDFC extends Bank { double getROI() { return 8.0; } }

public class AbstractClass {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        b1.welcome();
        System.out.println("SBI ROI: " + b1.getROI() + "%");
        System.out.println("HDFC ROI: " + b2.getROI() + "%");
    }
}
