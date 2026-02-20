package practice.Oops;

public class Admin extends Developer {

    public void manage() {

        super.read(); // read method is taken from parend class from guest class becouse of super
        //if super is not used// not created object becouse it is extends developer class, if not extending we need to create object
        write(); // it write method will takes from admin class only
        System.out.println("manage for developer");
    }

    public void read() {
        System.out.println("read admin");
    }
}
