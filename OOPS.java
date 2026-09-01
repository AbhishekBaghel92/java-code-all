package OOPS;

class Student {

    String name;
    int age;

    public void getInfo() {
        System.out.println("The name of the student is " + this.name);
        System.out.println("The age of the student is " + this.age);
    }
}

public class OOPS {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Ram";
        s1.age = 20;
        s1.getInfo();

        Student s2 = new Student();

        s2.name = "Alice";
        s2.age = 22;
        s2.getInfo();
    }
}