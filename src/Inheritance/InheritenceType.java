package Inheritance;

class D{

}

class A{
  int x=100;
  void display(){
      System.out.println(x);
  }
}

class B extends A {
    int y = 200;

    void show() {
        System.out.println(y);
    }
}
class C extends B{
    int z = 400;

    void printing() {
        System.out.println(z);
    }
}

public class InheritenceType {
    public static void main(String[] args) {
      D rvb=new D();

    }
}
