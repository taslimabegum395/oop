package Inheritance;

public class Car1 extends Car {

    public static void color(){
        System.out.println("red");

    }
    public  static void battery() {
        System.out.println("this is car1 battery");
    }

    public static void main(String[] args) {
        Car1.AirFilter();
        Car1.color();
        Car1.breaks();
        Car1.transmission();
        Car1.battery();
    }
}
