package part1;

// Student.java
public class Student {
    private String name;
    private int rollNumber;
    private String faculty;

    public Student(String name, int rollNumber, String faculty) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void displayProfile() {
        System.out.println("===== Student Profile =====");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNumber);
        System.out.println("Faculty : " + faculty);
    }

    public static void main(String[] args) {
        Student s = new Student("Supreya Shrestha", 101, "Networking & Cybersecurity");
        s.displayProfile();
        s.setFaculty("Computer Science");
        System.out.println("Updated Faculty: " + s.getFaculty());
    }
}
