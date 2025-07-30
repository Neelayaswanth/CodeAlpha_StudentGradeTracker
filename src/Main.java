import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> students = new ArrayList<Student>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=== Student Grade Tracker ===");
        
        while (true) {
            displayMenu();
            int choice = getMenuChoice();
            
            switch (choice) {
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    addGradeToStudent();
                    break;
                case 3:
                    displayStudentStatistics();
                    break;
                case 4:
                    displaySummaryReport();
                    break;
                case 5:
                    System.out.println("Thank you for using Student Grade Tracker!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
    
    private static void displayMenu() {
        System.out.println("\nPlease select an option:");
        System.out.println("1. Add a new student");
        System.out.println("2. Add a grade to an existing student");
        System.out.println("3. Display statistics for a specific student");
        System.out.println("4. Display summary report of all students");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }
    
    private static int getMenuChoice() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.nextLine(); // Clear the invalid input
                System.out.print("Enter your choice (1-5): ");
            }
        }
    }
    
    private static void addNewStudent() {
        scanner.nextLine(); // Clear the buffer
        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();
        
        if (name.isEmpty()) {
            System.out.println("Student name cannot be empty.");
            return;
        }
        
        // Check if student already exists
        if (findStudent(name) != null) {
            System.out.println("A student with this name already exists.");
            return;
        }
        
        Student newStudent = new Student(name);
        students.add(newStudent);
        System.out.println("Student '" + name + "' added successfully!");
    }
    
    private static void addGradeToStudent() {
        scanner.nextLine(); // Clear the buffer
        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();
        
        Student student = findStudent(name);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }
        
        System.out.print("Enter grade (0-100): ");
        int grade = getGradeInput();
        
        if (grade >= 0 && grade <= 100) {
            student.addGrade(grade);
            System.out.println("Grade " + grade + " added to student '" + name + "' successfully!");
        } else {
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
        }
    }
    
    private static void displayStudentStatistics() {
        scanner.nextLine(); // Clear the buffer
        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();
        
        Student student = findStudent(name);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }
        
        System.out.println("\n=== Statistics for " + name + " ===");
        System.out.println("Grades: " + student.getGrades());
        System.out.printf("Average Grade: %.2f\n", student.getAverageGrade());
        System.out.println("Highest Grade: " + student.getHighestGrade());
        System.out.println("Lowest Grade: " + student.getLowestGrade());
    }
    
    private static void displaySummaryReport() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        
        System.out.println("\n=== Summary Report ===");
        System.out.println("Total Students: " + students.size());
        System.out.println();
        
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            System.out.println("Grades: " + student.getGrades());
            System.out.printf("Average: %.2f | Highest: %d | Lowest: %d\n", 
                student.getAverageGrade(), student.getHighestGrade(), student.getLowestGrade());
            System.out.println();
        }
    }
    
    private static Student findStudent(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }
    
    private static int getGradeInput() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input
                System.out.print("Enter grade (0-100): ");
            }
        }
    }
} 