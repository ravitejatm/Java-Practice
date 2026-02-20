package practice.Oops.Encapsulation;

public class Teacher {
    public static void main(String[] args) {
        Student s = new Student(101);
       // s.isAttanded = true; we should not access veriables directly
        s.setStudentAttanded(true);
        s.getStudentAttanded();
    }
}
