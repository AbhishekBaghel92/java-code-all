
package OOPS;

public class ParameterizedConstructor {

    String name;
    int age;

    ParameterizedConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        ParameterizedConstructor s1 =
                new ParameterizedConstructor("Ram", 20);

        ParameterizedConstructor s2 =
                new ParameterizedConstructor("Alice", 22);

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
    }
}

