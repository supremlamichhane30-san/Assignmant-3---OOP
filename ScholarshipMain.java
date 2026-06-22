package part10;

abstract class Scholarship {
    String studentName; double gpa;
    Scholarship(String n, double g) { studentName=n; gpa=g; }
    abstract boolean isEligible();
    abstract double getAmount();
    void displayResult() {
        System.out.println("Student : "+studentName);
        System.out.printf ("GPA : %.1f%n",gpa);
        System.out.println("Eligible : "+(isEligible()?"Yes":"No"));
        if(isEligible()) System.out.printf("Amount : NPR %.2f%n",getAmount());
        System.out.println("----------------------------");
    }
}
class MeritScholarship extends Scholarship {
    MeritScholarship(String n, double g) { super(n,g); }
    @Override public boolean isEligible() { return gpa>=3.7; }
    @Override public double getAmount() { return 50000.00; }
}
class NeedBasedScholarship extends Scholarship {
    double familyIncome;
    NeedBasedScholarship(String n, double g, double fi) { super(n,g); familyIncome=fi; }
    @Override public boolean isEligible() { return familyIncome<300000 && gpa>=2.5; }
    @Override public double getAmount() { return 30000.00; }
}
public class ScholarshipMain {
    public static void main(String[] args) {
        Scholarship m = new MeritScholarship("Surakksha", 3.96);
        Scholarship n = new NeedBasedScholarship("Soofie", 3.0, 250000);
        Scholarship x = new MeritScholarship("Sonam", 3.2);
        m.displayResult();
        n.displayResult();
        x.displayResult();
    }
}