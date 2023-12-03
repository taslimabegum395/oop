package Javaoop;

public class ThisKeyWord1 {
    int x,y;//class er under e variable k class variable instance /global variable bole
//            void setData(int x,int y){// method er under er veriable k local variable bole
//                this. x=x;
//                this.y=y;

// now want to make of this class as a construtor like  ThisKeyWord1(){}



    ThisKeyWord1( int x, int y){// if i will take different variable it will take space
        //ai guli k amra consise kortesi
        this.x = x;
        this.y = y;
//now we should run to method .what should we do? we should create method

    }

    void display () {
        System.out.println(x);
        System.out.println(y);
    }


}



