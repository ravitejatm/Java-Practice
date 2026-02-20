package practice.Oops.Encapsulation;

public class Student {
    private int rollNo;
    private String name;
    private boolean isAttanded;

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setStudentAttanded(boolean flag) {
       if(!isAttanded)
           isAttanded = flag;
           System.out.println("Student is attanded to " + isAttanded);
    }
    public boolean getStudentAttanded() {
        System.out.println("Student is attanded to " + isAttanded);
        return isAttanded;
    }

}
