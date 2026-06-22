package part2;

class Employee {
    String name; int empId;
    Employee(String name, int empId) { this.name=name; this.empId=empId; }
    void displayDetails() { System.out.println("Employee: "+name+" | ID: "+empId); }
}
class Teacher extends Employee {
    String subject;
    Teacher(String name, int empId, String subject) { super(name,empId); this.subject=subject; }
    @Override
    void displayDetails() {
        System.out.println("-- Teacher --");
        System.out.println("Name : "+name);
        System.out.println("ID : "+empId);
        System.out.println("Subject: "+subject);
    }
}
class AdminStaff extends Employee {
    String department;
    AdminStaff(String name, int empId, String dept) { super(name,empId); this.department=dept; }
    @Override
    void displayDetails() {
        System.out.println("-- Admin Staff --");
        System.out.println("Name : "+name);
        System.out.println("ID : "+empId);
        System.out.println("Department: "+department);
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Teacher t = new Teacher("Dr. Ram Kumar", 201, "OOP");
        AdminStaff a = new AdminStaff("Sita Sharma", 301, "Accounts");
        t.displayDetails();
        System.out.println();
        a.displayDetails();
    }
}
