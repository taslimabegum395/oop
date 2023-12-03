package Inheritance;

public  class Car {
    public static void breaks() {
        System.out.println("moderan cars have 4 brakes");
    }

    public  static void battery() {
        System.out.println("this tis car battery");
    }
    public static void transmission() {
        System.out.println("one treansmission");
    }
    public static void AirFilter(){
        System.out.println("Two air filter");

}}
//A very important fact to remember is that Java does not support multiple inheritance.
// This means that a class cannot extend more than one class.

//In Java, inheritance can be implemented in three forms:
//1.A class inherits another class. The keyword extends is used,
////public class Deisnger extends Person { }
//2.A class implements another interface. The keyword implements is used,
////public class Shirt implements Wearable { }
//3.An interface inherits another interface. The keyword extends is used, for example:
////public interface List extends Collection { }

//multiple class is needed,method name same ,return type must be same

//subclass (child) - the class that inherits from another class
//superclass (parent) - the class being inherited from
//To inherit from a class, use the extends keyword.
//if we write final keyword fron of clss name we can't inherrit//If you try to access a final class, Java will generate an error:
//The final Keyword:If you don't want other classes to inherit from a class, use the final keyword:
//final class Vehicle {
//  ...
//}
//class Car extends Vehicle {
//  ...
//}
//The output will be something like this:
////Main.java:9: error: cannot inherit from final Vehicle
//class Main extends Vehicle {
//1 error)
//In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):
//Inheritance is one of the OOPs concepts which means getting the common properties from one class to another class.
//- A class (child class) can inherit methods, attributes(variables) from another class(parent class)
//Syntax: Class A(child) extends Class B(parent)
//- In the above syntax Class A is the child class which inherits properties
//(methods, attributes) from Class B which is the parent class and “extends” is a keyword.
//In inheritance Child class override the methods in Parent class. (Overriding polymorphism)
// There are three types of inheritance:
//1. Single Level A  B
//2. Multi Level A  B  C
//3. Multiple inheritance A  B, A  C (Not possible in class but interface)
// Multiple inheritance Not possible in class level  but interface level
//Like in real world one child can not have two father or mother. So can not inherit from two father.
//Syntax: Class A implements Interface B, C, D;
//- In the above syntax Class A is the child class that inherits Interface B,C and D.
// In this case “implements” is the keyword that is used.
//A very important fact to remember is that Java does not support multiple inheritance. This means that a class cannot extend more than one class. Therefore following is illegal −
//The parent class is also called the superclass or the base class.
//The child class is also called the subclass or the derived class.(de rived)
//what is derived class
//A derived class is a class that is constructed from a base class or an existing class. 2. Base class can't acquire the methods and properties of the derived class. Derived class can acquire the methods and properties of the base class.


//3. How is Inheritance implemented in Java?
//In Java, inheritance can be implemented in three forms:

//A class inherits another class. The keyword extends is used, for example:
//1.public class Person { }
//public class Deisnger extends Person { }
//public class Programmer extends Person { }
//public class Architect extends Programmer { }

//A class implements another interface. The keyword implements is used, for example:

//public interface Wearable { }
//public class Shirt implements Wearable { }
//public class Glass implements Wearable { }

//An interface inherits another interface. The keyword extends is used, for example:
//public interface Collection { }
//public interface List extends Collection { }
//public interface Set extends Collection { }

//Generally, the implements keyword is used with classes to inherit the properties of an interface. Interfaces can never be extended by a class.
//Example
//
//public interface Animal {
//}
//
//public class Mammal implements Animal {
//}
//
//public class Dog extends Mammal {}

//Why Multiple Inheritance Is Not Supported Java?

//In java, multiple inheritance is not supported because of ambiguity problem.
// We can take the below example where we have two classes Class1 and Class2 which have same method display().
// If multiple inheritance is possible than Test class can inherit data members (properties) and methods (behaviour) of both Class1 and Class2 classes. Now, Test class have two display() methods inherited from Class1 and Class2.
// Problem occurs in method call, when display() method will be called with Test class object which method will be called,
// will it be of Class1 or Class2. This is ambiguity problem because of which multiple inheritance is not supported in java.