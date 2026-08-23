class Person {

    String name;
    int age;

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Manager m = new Manager();

        m.name = "Abhishek";
        m.age = 20;
        m.empId = 101;
        m.department = "IT";

        m.printAllDetails();
    }
}

class Employee extends Person {

    int empId;

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {

    String department;

    void printAllDetails() {

        System.out.println("----- Manager Details -----");

        displayPersonDetails();
        displayEmployeeDetails();

        System.out.println("Department: " + department);
    }
}