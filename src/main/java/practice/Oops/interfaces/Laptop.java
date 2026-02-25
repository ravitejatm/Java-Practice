package practice.Oops.interfaces;

public interface Laptop {

    public void copy();

    public void paste();

    public void cut();

    public void keyboard();

    //after java8 we can implement methods
    //we should use default or static methods
    default void security() {

        // if you want you can write or lave it empty
        System.out.println("INTERFACE DEFAULT IMPLEMENTATION");

    }

    static void camera() {
        System.out.println("INTERFACE CAMERA IMPLEMENTATION");
    }

}
