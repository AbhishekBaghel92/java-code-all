public class EmployeeSalary {

    private int empId;
    private String name;
    private String department;
    private double salary;

    // Setter and Getter for empId
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    // Setter and Getter for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Setter and Getter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    // Setter for salary with validation
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Error: Salary cannot be negative.");
            this.salary = 15000.0;
        } else {
            this.salary = salary;
        }
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        EmployeeSalary emp = new EmployeeSalary();

        emp.setEmpId(101);
        emp.setName("Abhishek");
        emp.setDepartment("IT");

        // Valid salary
        emp.setSalary(25000.0);
        System.out.println("Valid Salary: " + emp.getSalary());

        // Invalid negative salary
        emp.setSalary(-5000.0);
        System.out.println("Salary after validation: " + emp.getSalary());
    }
}
