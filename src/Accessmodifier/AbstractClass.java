package Accessmodifier;


// Abstraction means hiding the details and showing only the outcome to the end-user
//outcome to the end-user

 //abstract is like a parent class, we create subclass to inherate from abstract class.imp

    //abastac purpose to be inheritance
//1.Abstract class has both abstract and non-abstract methods inside it.
//2. Interface (has only abstract method inside)
// We can achieve 0% to 100% abstraction.
    // we should write before class abstract
    //without body
//Abstraction can be achieved with either abstract classes or interfaces
    //non abstract class can not handle abstract method
    //abstract class is used such as a parent class for the code to be reused
    //abstract is like a parent class, we create subclass to inherate from abstract class
    //we use abstraction reduce code, and reduce complicity
    //An abstract class can inherit a class and multiple interfaces.Aug 5, 2023
   //can abstract class be overridden?
    //A class can override an abstract method by using the same signature as the original method, but with a different body or code.
//Can abstract methods be overridden True or false?////An abstract method cannot be overridden.
//Which abstract class method Cannot be overridden?//
// Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
// Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
//To access the abstract class, it must be inherited from another class. Let's convert the Animal class we used in the Polymorphism chapter to an abstract class:
        // Abstract class
        abstract class Animal {
            // Abstract method (does not have a body)
            public abstract void animalSound();


            // Regular method
            public  void sleep() {
                System.out.println("Zzz");
            }
        }
//it is not possible to create an object of the Animal class:
        // Subclass (inherit from Animal)
class Pig extends Animal {

            public void animalSound() {
               //  The body of animalSound() is provided here
                System.out.println("The pig says: wee wee");
            }
        }

        class Main {
            public static void main(String[] args) {
                Pig myPig = new Pig(); // Create a Pig object
                myPig.animalSound();
               myPig.sleep();
                myPig.animalSound();
                myPig.sleep();
            }
        }






//An abstract method must be overridden in the sub class whereas final method cannot be overridden.

//abstarct method overridden in subclass
//Can abstract classes be inherited?
//yes you can inherit abstract class from another abstract class. Yes you can inherit or extend one abstract class to another abstract class but if the class is a sealed class or single ton class at that time only inheritance cant be applicable. Yes, we can inherit an abstract class fron another abstract class.Ap
//Can we inherit abstract class in Java?
//If a class is declared abstract, it cannot be instantiated. To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it. If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.
// It cannot support multiple inheritances.

//Which class Cannot be inherited in Java?
//The final class is a class that is declared with the final keyword. Subclasses can't inherit a final class or a final class cannot be inherited by any subclass. So, we can restrict class inheritance by making use of a final class.
//Can we inherit abstract class and interface?
//Interfaces help to define the peripheral abilities of a class. An abstract class defines the identity of a class. An interface can inherit multiple interfaces but cannot inherit a class. An abstract class can inherit a class and multiple interfaces.Aug 5, 2023

//Can we inherit more than one abstract class?////A class can inherit from multiple abstract classe
//What is not allowed in abstract class?//It is not allowed to create objects of abstract classes.
//Can an abstract method be declared as static//no ,
// //Can an abstract method be declared private modifier// No, it cannot be private because the abstract method must be implemented in the child class. If we declare it as private, we cannot implement it from outside the class.
//16. Can an abstract class have constructor?yes//what is not allowed in abstract class?
//it isnot allow to create objects of object classes

//Can we create object of abstract class?//We cannot create objects of an abstract cl//Can we inherit abstract class in Java?
//Abstract Class. So by this rule, an abstract class cannot be private.
//What types of method Cannot be abstract in Java?static
//If a class is declared abstract, it cannot be instantiated. To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it. If you inherit an abstract class, you have to provide implementations to all the abstract
//Is abstract class private or protected?//the abstract method cannot be private.Jun 29, 2020
// Can we create constructor in abstract class?
//Abstract classes can have constructors, but they cannot be instantiated directly. The constructors are used when a concrete subclass is created.