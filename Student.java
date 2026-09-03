package OOPS.Polymorephism;

public class Student {
    String name;
    int age;

    public void displayinfo(String name)
    {
        System.out.println(name);
    }

    public void displayinfo(int age)
    {
        System.out.println(age);
    }

    public void displayinfo(String name, int age)
    {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayinfo("Ram");
        s1.displayinfo(20);
        s1.displayinfo("Ram", 20);
    }


    
    
    
    
}
