
import java.util.Scanner;

class Attendance {
    int attended, total;

    Attendance(int attended, int total) {
        this.attended = attended;
        this.total = total;
    }

    double calculateAttendance() {
        return (attended * 100.0) / total;
    }

    void display() {
        double percent = calculateAttendance();
        System.out.printf("Attendance : %.2f%%%n", percent);
    }
}

class EngineeringAttendance extends Attendance {
    EngineeringAttendance(int a, int t) {
        super(a, t);
    }

    @Override
    double calculateAttendance() {
        System.out.print("[Engineering - Min 75%] ");
        return super.calculateAttendance();
    }
}

class MedicalAttendance extends Attendance {
    MedicalAttendance(int a, int t) {
        super(a, t);
    }

    @Override
    double calculateAttendance() {
        System.out.print("[Medical - Min 80%] ");
        return super.calculateAttendance();
    }
}

public class AttendanceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Attendance Calculator ===");
        System.out.print("Enter department (1 = Engineering, 2 = Medical): ");
        int choice = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attended = sc.nextInt();

        System.out.print("Enter total classes: ");
        int total = sc.nextInt();

        Attendance att;

        if (choice == 1) {
            att = new EngineeringAttendance(attended, total);
        } else if (choice == 2) {
            att = new MedicalAttendance(attended, total);
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        att.display();
        sc.close();
    }
}
