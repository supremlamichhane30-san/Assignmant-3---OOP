package part6;

class Member {
    String memberName;
    Member(String memberName) { this.memberName=memberName; }
    int borrowingLimit() { return 2; }
    void displayInfo() {
        System.out.println("Member : "+memberName);
        System.out.println("Borrow Limit: "+borrowingLimit()+" books");
    }
}
class StudentMember extends Member {
    StudentMember(String name) { super(name); }
    @Override public int borrowingLimit() { return 3; }
}
class TeacherMember extends Member {
    TeacherMember(String name) { super(name); }
    @Override public int borrowingLimit() { return 10; }
}
public class LibraryMain {
    public static void main(String[] args) {
        Member sm = new StudentMember("Surakksha");
        Member tm = new TeacherMember("Prof. Atharv");
        sm.displayInfo();
        System.out.println();
        tm.displayInfo();
    }
}