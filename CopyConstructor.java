
package OOPS;

public class CopyConstructor {

    String name;
    int age;

    // Parameterized Constructor
    CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    CopyConstructor(CopyConstructor s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    public static void main(String[] args) {

        CopyConstructor s1 =
                new CopyConstructor("Ram", 20);

        CopyConstructor s2 =
                new CopyConstructor(s1);

        System.out.println("Student 1:");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        System.out.println();

        System.out.println("Student 2:");
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
    }
}
