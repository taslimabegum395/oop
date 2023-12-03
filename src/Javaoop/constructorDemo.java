package Javaoop;

public class constructorDemo {
    int x;
    int y;
    String z;
    //class er under  e je variabl thke  taha instance /class variable boli/global o bolte pari
// Defualt constructor// je constructor e kono parametarization nai,amra just assigning the value of variable
    //that is called defuelt constructor
// constructor k print korar jonno method lagbe
//oi method er modde variable guli dokai dite hobe.then it will be print.others wise it will not print
//    constructorDemo() {
//         x =100;
//         y=200;
//         z = "welcome";
//
//    }
    void display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

        public static void main (String[]args){
          constructorDemo cd = new constructorDemo(3,5,"kkkkk");
           cd.display();

        }

    //parameterized constructor
// constructor autometic initialize kore
    //for the int it will be zero
    //for the String it will be null
    constructorDemo(int a,int b,String p){// here i parametarized 2 int value and 1 string value
        x=a;
        y=b;
        z=p;
    }
    }
