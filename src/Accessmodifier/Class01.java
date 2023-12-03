package Accessmodifier;

import Accessmodifier2.testclass2;
public class Class01 extends  testclass2 {//testclass2 er all property now Class01 er modde ase


   public static void main(String[] args) {
        testclass2 c1 = new testclass2();
        c1.displayhafcapublic();
//since this is a seperate package, only piblic and protech can be accessed but not private

        Class01 cs= new Class01() ;
        cs.displayhafcaprotect();
        cs.displayhafcapublic();


            }






    }






