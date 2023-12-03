package Javaoop;

public class Extraquestion {
    //Can We Declare The Main Method As Final? yes
    //public class Main
    //{
    //	public static final void main(String[] args) {
    //		System.out.println("Final main method");
    //	}
    //}
    //Output
    //
    //Final main method


    //Final Variable In Java
    //A Final variable in java is declared with final keyword. It can represent a member variable or local variable. The final variables represents the constants in java and normally declared with static keyword. As final variables are constants that’s why they are initialised at the time of declaration and can’t be reassigned.
    //
    //Example
    //class FinalVariableTest{
    //	//final variable
    //	final String website = "w3spoint.com";
    //
    //	public void show(){
    //		//error because value of final variable can't be change.
    //		website = "java.com";
    //		System.out.println("website = " + website);
    //	}
    //}
    //public class Main {
    //	public static void main(String args[]){
    //		//creating object of FinalVariableTest Class
    //		FinalVariableTest obj = new FinalVariableTest();
    //		//method call
    //		obj.show();
    //	}}

   // Output
   // Main.java:7: error: cannot assign a value to final variable website
   // website = "java.com";
	//	^
   //             1 error
}
//final variable can't be change.
//Final Keyword In Java
    //final is a keyword in java which can be used with instance variables, local variables , methods and classes.
//This program is used to show that final method can't be overrid
//This program is used to show that final class can't be inherited.
//* final parameter can't be changed.
//Abstract Vs Final Method In Java
//An abstract method must be overridden in the sub class whereas final method cannot be overridden.

//Example: abstarct method overridden in subclass
//
//abstract class AbstractMethodTest{
//	abstract void show();
//
//}
//public class Main extends AbstractMethodTest {
//    void show() {
//        System.out.println("Inside overridden show method");
//    }
//	public static void main(String args[]){
//		//creating object of Main Class
//		Main obj = new Main();
//		obj.show();
//	}
//}
//Output
//
//Inside overridden show method
// * final parameter can't be changed.