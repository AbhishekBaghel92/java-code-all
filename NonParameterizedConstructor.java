
package OOPS;

public class NonParameterizedConstructor {

    String name;
    int age;

    NonParameterizedConstructor() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Ram";
        s1.age = 20;

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}
