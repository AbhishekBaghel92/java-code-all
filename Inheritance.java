class Person {
    String name; int age;
    void displayPersonDetails() { System.out.println("Name: " + name + ", Age: " + age); }
}
class Employee extends Person {
    int empId;
    void displayEmployeeDetails() { System.out.println("Emp ID: " + empId); }
}
class Manager extends Employee {
    String department;
    void printAllDetails() {
        displayPersonDetails();
        displayEmployeeDetails();
        System.out.println("Department: " + department);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Anita"; m.age = 35; m.empId = 7; m.department = "IT";
        m.printAllDetails();
    }
}
