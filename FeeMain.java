package part4;

abstract class Student {
    String name;
    Student(String name) { this.name=name; }
    abstract double calculateFee();
    void displayFee() {
        System.out.println("Student : "+name);
        System.out.printf("Total Fee: NPR %.2f%n", calculateFee());
    }
}
class Undergraduate extends Student {
    Undergraduate(String name) { super(name); }
    @Override public double calculateFee() { return 85000.00; }
}
class Graduate extends Student {
    Graduate(String name) { super(name); }
    @Override public double calculateFee() { return 120000.00; }
}
public class FeeMain {
    public static void main(String[] args) {
        Student s1 = new Undergraduate("Supreya");
        Student s2 = new Graduate("Rahul Sharma");
        s1.displayFee();
        s2.displayFee();
    }
}
