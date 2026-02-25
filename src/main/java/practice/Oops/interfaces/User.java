package practice.Oops.interfaces;

public class User {
    public static void main(String[] args) {
        Lenova l = new Lenova();
        l.copy();
        l.paste();
        l.cut();
        l.keyboard();
        l.show();
        l.security();
        Laptop.camera(); //STATIC

        HP hp = new HP();
        hp.copy();
        hp.paste();
        hp.cut();
        hp.keyboard();
        hp.printer();

        // it will point to interface // abstract happening here
        // implementation is hidding
        Laptop ll = new Lenova();
        ll.copy(); // copy will point to interface not from lenova;
        ll.paste();
    }
}
