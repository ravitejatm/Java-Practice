package practice.Oops.AbstractMethod;

import practice.Oops.interfaces.Laptop;


//Abstraction is the process of hiding the implementation details and showing only functionality to the user.


public abstract class AbstractClass implements Laptop {


    // abstract class is aclass which cantain abstract methods and is defined with the keyword abstract.
    // unimplemented methods in class
    //partial implementation
    //if method is not implemented we need to mention abstract keyword
    // use: multing classes are implementing same code used in asbtract class and remaing we can create.
    // non abstract methods can be used in abstract but, abstract methods can be used in abstract class only.


    @Override
    public void copy() {
        System.out.println("abstract class copy");
    }

    @Override
    public void paste() {
        System.out.println("interface paste");
    }

    @Override
    public abstract void cut(); //if not implementing method we need to use abstract keyword.
}
