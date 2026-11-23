class Employee {
    private int empId;
    private String name;
    private double salary;

    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Error: Salary cannot be negative! Defaulting to 15000.0");
            this.salary = 15000.0;
        } else {
            this.salary = salary;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(101);
        e.setName("Rohan");
        e.setSalary(50000);
        System.out.println(e.getEmpId() + " " + e.getName() + " " + e.getSalary());
        e.setSalary(-100);
        System.out.println("Salary now: " + e.getSalary());
    }
}
