package Javaoop;

//how can we do multiple inheritance
//

public class MultipleInterfaces implements MyFirstInterface , MySecondInterface{// here is MultipleInterfaces
//class implement//class er modde implements keyword use kore interface k inharit kore 100% abstraction achive korsi
   //one class can inherrit multiple interface at the same time //here class mutipl...inherrit korse diff.interfack

    // interface used to achichiv 100% abstraction
    // interface support mutiple inherritance
    //interface use to not void defendency
    //
    @Override
    public void myFirstInterfaceMehod() {
        System.out.println("Some text");


    }
    @Override
    public void myOtherMethod() {

            System.out.println("Some other text");
        }

    public static void main(String[] args) {
        MultipleInterfaces myobj= new MultipleInterfaces();
        myobj.myFirstInterfaceMehod();
        myobj.myOtherMethod();
    }
    }

//Why Do We Need Inheritance?
//Run-Time Polymorphism. Runtime also known as dynamic polymorphism, is a method call in the execution process that overrides a different method in the run time
//Code Reusability