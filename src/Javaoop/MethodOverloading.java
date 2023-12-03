package Javaoop;

public class MethodOverloading {

//        Method Overloading Rules
//          Methods names should/must be same
//          Numbers of parameters should / must be different
//          Data type must be different(if parameters count is same)
//          Order of parameters must be defferent

    int x, y;
    double d;

    void sum() {
        x = 20;
        y = 50;
        System.out.println(x + y);
    }
    void sum(int a,int b){

       x=a;
        y=b;
        System.out.println(a+b);
    System.out.println(x +y);
}
void sum(int a, double b) {
    x = a;
    d = b;
    System.out.println(x + y);
}
void sum(double b, int a) {
    x = a;
    d = b;
    System.out.println(x + y);
}
public static void main(String[] args) {
    MethodOverloading mo = new MethodOverloading();
    mo.sum();
    mo.sum(20, 50);
    mo.sum(10, 5);
    mo.sum(5, 9);


}
    }

    // Polymorhism:can be achieved by method overloading and method overriding
//         Shape- cirlce, triangle, oval, sqauire
//         STATE- NY, Cal, Texas, Florida, Ohio, Atlanta
//         Lisa- Women, Daughter, Mother, Wife, Sister






