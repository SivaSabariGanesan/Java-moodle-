Q3)Create a class Student with two private attributes, name and roll number. Create three objects by invoking different constructors available in the class Student. 

Student()

Student(String name)

Student(String name, int rollno)

Answer:
import java.util.Scanner;

class Student {
    private String name;
    private int roll;
    public Student() {
        this.name = null;
        this.roll = 0;
        System.out.println("No-arg constructor is invoked");
    }
    
    public Student(String n) {
        this.name = n;
        this.roll = 0;
        System.out.println("1 arg constructor is invoked");
    }
    
    public Student(String n, int r) {
        this.name = n;
        this.roll = r;
        System.out.println("2 arg constructor is invoked");
    }
    
    public void display() {
        System.out.println("Name =" + this.name + " , Roll no = " + this.roll);
    }
}

public class prog {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Rajalakshmi");
        Student s3 = new Student("Lakshmi", 101);
        
        s1.display();
        s2.display();
        s3.display();
    }
}
