package Javaoop;

public class GetterSetterMethod {
//Encapsulation is a part  java oops concepts.
//The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
    // How to achieve encapsulation in Java?
// To achieve this,we must:
//declare class variables/attributes as private
//provide public get and set methods to access and update the value of a private variable

// private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.

    //The get method returns the variable value, and the set method sets the value.
//
//Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:
   private String name;//privite=restricted access
   //getter method
    public String getName(){
       return name;
   }
   //setter method
    public void setName(String newName){
       this.name=newName;
    }

    public static void main(String[] args) {
        GetterSetterMethod obj=new GetterSetterMethod ();
        obj.name="Hafca";
        System.out.println( obj.name);

    }

    }






