package part9;

class Student {
    private static int counter = 1000;
    private int studentId;
    private String name;
    Student(String name) { this.name=name; this.studentId=++counter; }
    void display() { System.out.println("ID: "+studentId+" | Name: "+name); }
}
public class UniqueIdMain {
    public static void main(String[] args) {
        Student s1 = new Student("Surakksha");
        Student s2 = new Student("Soofie");
        Student s3 = new Student("Sonam");
        s1.display();
        s2.display();
        s3.display();
    }
}