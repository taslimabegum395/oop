package Javaoop;

public class MethodandConstruction {

    /*METHOD- is block or group of statement which perform certain task
    We have to call method through object
    1. no params    no return value
    2. no params    return value
    3. Take params  no return values
    4. Take params  return value

     */
    // 1. no params    no return value
    public void greeting01(){
    System.out.println("Hello I am a method no parameter and no reurn type value");
}
//2. no params    return value
String greeting02() {
    return "Hello I am a method no parameter but return type value";

}
// 3. Take params  no return values
void greeting03(String name){

    System.out.println("Hello I am a method that no returns with parameters "+ name);
}
//take params return value
String greetinnng04(String name) {

    return "Hello...I am a method with return value and params " + name;
}
public static void main(String[] args) {
        MethodandConstruction mc=new  MethodandConstruction();
      mc.greeting01();
      String msg=mc.greeting02();
        System.out.println(msg);
        mc.greeting03("Mosammat");
       String msg1= mc.greetinnng04("Begum");
    System.out.println(msg1);
    }
}
 /* Method VS Constructor
        Method:
        1. Method name can be anything/Methods name must be different from the class name
        2. Method may or may not return a value
        3. If method is not returning any value then specify VOID
        4. Method can take parameters/arguments
        5. We have to invoke/call methods explicitly through object
        6. Used for logical concept/implement logic
        Constructor:
        1. Constructor name must be the same as class name
        2. Constructor will never return any value
        3. We are not allowed to specify the VOID
        4. Constructor can take parameters/arguments
        5. Constructor automatically invoked at the time of object creation
        6. Used for initializing/assigning values of the variables
     */
