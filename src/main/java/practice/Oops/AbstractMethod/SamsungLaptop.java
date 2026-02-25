package practice.Oops.AbstractMethod;

public class SamsungLaptop extends AbstractClass {
    @Override
    public void copy() {
        System.out.println("abstract class copy");
    }


    //cut and keyboard is not implemented in abstract class it is asking to implement in this class because it is extending interface. other two classes are implemented in abstract class.

    @Override
    public void cut() {

    }

    @Override
    public void keyboard() {

    }
}
