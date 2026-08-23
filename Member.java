class Member {

    String name;
    int age;
    double salary;

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.name = "Abhishek";
        e.age = 20;
        e.salary = 25000;
        e.specialization = "Java";

        System.out.println("Employee Details:");
        e.printDetails();

        System.out.println();

        Manager m = new Manager();

        m.name = "Rahul";
        m.age = 35;
        m.salary = 50000;
        m.department = "IT";

        System.out.println("Manager Details:");
        m.printDetails();
    }
}

class Employee extends Member {

    String specialization;

    void printDetails() {
        super.printDetails();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {

    String department;

    void printDetails() {
        super.printDetails();
        System.out.println("Department: " + department);
    }
}