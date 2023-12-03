package Accessmodifier;

import Accessmodifier2.testclass2;
import Javaoop.MethodandConstruction;

public class testclass1 extends MethodandConstruction {

    /*
     * public - we can access anywhere
     * protected - we can access outside the packages - but through inheritance
     * default - only within the package
     * private -only within the class
     */


    public static void main(String[] args) {

        testclass1 tc1 = new testclass1();
       tc1. greeting01();
      //  testclass2 tc2= new testclass2();
      //  tc2.displayhafcapublic();




    }
}