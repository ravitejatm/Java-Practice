package practice.Oops.interfaces;


//@OVERRIDE SHOUILD USE WHEN A IMPLEMETED METHOD OVERRIDED(like default method in interface want to use it again in calss)
public class Lenova implements Laptop{

    //@Override in not mandatory

    @Override
    public void copy() {
        System.out.println("Lenova Copy code");
    }

    @Override
    public void paste() {
        System.out.println("Lenova Paste code");

    }

    @Override
    public void cut() {
        System.out.println("Lenova Cut code");

    }

    @Override
    public void keyboard() {
        System.out.println("Lenova Keyboard code");

    }

    public void  show() {
        System.out.println("Lenova show code");
    }

    @Override
    public void security() {
        System.out.println("LENOVA IMPLEMENTATION");
    }
}
