import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private double marks;
    private String grade;

    private static int studentCount = 0;
    private final String COURSE_NAME = "Artificial Intelligence And Data Science";

    public Student(String name, int id, double marks, String grade) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.grade = grade;
        studentCount++;
    }

    public void displayStudent() {
        System.out.println("Course: " + COURSE_NAME + " | ID: " + id + " | Name: " + name + " | Marks: " + marks + " | Grade: " + grade);
    }

    public static void displayTotalStudents() {
        System.out.println("\nTotal Students Created: " + studentCount);
    }
}

public class Student_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the number Of Students whose data is to be Analyzed :");
        int n = sc.nextInt();
        
   
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Marks: ");
            double marks = sc.nextDouble();

            String grade = (marks >= 90) ? "A" : (marks >= 75) ? "B" : (marks >= 50) ? "C" : "D";

            students[i] = new Student(name, id, marks, grade);
        }

        System.out.println("\n--- Student Records ---");
        for (Student s : students) {
            s.displayStudent();
        }

        Student.displayTotalStudents();
        sc.close();
    }
}
