package Javaoop;

public class OverloadingPractice {


   static int add(int a, int b) {
      return (a+b);
    }

static double add(double x, double y){
       return (x-y);
}

    public static void main(String[] args) {
        System.out.println(OverloadingPractice.add(10,5));
        System.out.println(OverloadingPractice.add(10.5,5.5));


    }

}
