package part5;

import java.util.Scanner;

interface ResultProcessor {
    String calculateGrade(double marks);
}

class EngineeringDepartment implements ResultProcessor {
    @Override
    public String calculateGrade(double marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B+";
        else if (marks >= 60) return "B";
        else return "F (Fail)";
    }
}

class ManagementDepartment implements ResultProcessor {
    @Override
    public String calculateGrade(double marks) {
        if (marks >= 85) return "Distinction";
        else if (marks >= 70) return "First Division";
        else if (marks >= 55) return "Second Division";
        else return "Fail";
    }
}

public class GradeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Grade Calculator ===");
        System.out.print("Enter department (1 = Engineering, 2 = Management): ");
        int choice = sc.nextInt();

        System.out.print("Enter marks (0 - 100): ");
        double marks = sc.nextDouble();

        ResultProcessor processor;

        if (choice == 1) {
            processor = new EngineeringDepartment();
            System.out.println("Department : Engineering");
        } else if (choice == 2) {
            processor = new ManagementDepartment();
            System.out.println("Department : Management");
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + processor.calculateGrade(marks));

        sc.close();
    }
}