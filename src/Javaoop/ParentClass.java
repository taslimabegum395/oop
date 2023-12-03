package Javaoop;

public class ParentClass {
    int num=10;
    void showDate(){
        System.out.println("Inside parentClass showData()method");
        System.out.println("num=  " + num);
    }

}
class ChildClass extends  ParentClass {
    void showDate() {
        System.out.println("Inside child Class showData()method");
        System.out.println("num=  " + num);
    }
}
 class PurePolypormisom{
    public static void main(String[] args) {
        ParentClass obj=new ParentClass();
        obj.showDate();

        ChildClass obj1=new ChildClass();
        obj1.showDate();

    }

}