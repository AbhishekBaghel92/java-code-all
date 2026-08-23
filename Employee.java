public class Employee {

    // Private variables
    private int empId;
    private String name;
    private String department;

    // Setter for empId
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter for empId
    public int getEmpId() {
        return empId;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    public static void main(String[] args) {

        // Create Employee object
        Employee emp = new Employee();

        // Set values using setters
        emp.setEmpId(101);
        emp.setName("Abhishek");
        emp.setDepartment("IT");

        // Get values using getters
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
    }
}