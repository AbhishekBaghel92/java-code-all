class Student {
    String name;
    int rollNo;
    char grade;

    void displayInfo() {
        
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Abhishek";
        s1.rollNo = 101;
        s1.grade = 'A';

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.rollNo = 102;
        s2.grade = 'B';
         
         System.out.println("Student Information :-");
        s1.displayInfo();
        s2.displayInfo();
    }
}
