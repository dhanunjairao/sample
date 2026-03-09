import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    String course;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student s = new Student();
        s.getDetails();
        s.displayDetails();
    }
}
