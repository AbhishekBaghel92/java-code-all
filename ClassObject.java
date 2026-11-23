public class ClassObject {
    String name;
    int rollNo;
    char grade;

    void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        ClassObject s1 = new ClassObject();
        s1.name = "Rohan"; s1.rollNo = 1; s1.grade = 'A';
        ClassObject s2 = new ClassObject();
        s2.name = "Aman"; s2.rollNo = 2; s2.grade = 'B';
        s1.displayInfo();
        s2.displayInfo();
    }
}
