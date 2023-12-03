package Accessmodifier2;

public abstract class Animal {//  abstract class er obj create kora hoi na
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
//From the example above, it is not possible to create an object of the Animal class:
//
//Animal myObj = new Animal(); // will generate an error
//The abstract keyword is a non-access modifier, used for classes and methods:
//Data abstraction is the process of hiding certain details and showing only essential information to the user.
//To access the abstract class, it must be inherited from another class. Let's convert the Animal class we used in the Polymorphism chapter to an abstract class: