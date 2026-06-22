package part3;

import java.util.ArrayList;
class Course {
    String courseName, courseCode;
    Course(String n, String c) { courseName=n; courseCode=c; }
}
class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();
    Student(String name) { this.name=name; }
    void registerCourse(Course c) { courses.add(c); }
    void displayCourses() {
        System.out.println("Student: "+name);
        System.out.println("Registered Courses:");
        for(Course c: courses)
            System.out.println(" ["+c.courseCode+"] "+c.courseName);
    }
}
public class CourseMain {
    public static void main(String[] args) {
        Student s = new Student("Supreya");
        s.registerCourse(new Course("Object Oriented Programming", "BCSNT6063"));
        s.registerCourse(new Course("Networking Fundamentals", "BCSNT6001"));
        s.registerCourse(new Course("Database Management", "BCSNT6020"));
        s.displayCourses();
    }
}
