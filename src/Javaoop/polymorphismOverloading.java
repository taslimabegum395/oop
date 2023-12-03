package Javaoop;

public class polymorphismOverloading {
    // Polymorphism means "many forms",
    //2 types 1.overloading,Overriding
    //     Method Overloading Rules
//          Methods names should/must be same but parameters should / must be different
//          Order of parameters must be defferent
    //types of polymorphism :Static polymorphism- method overloading -it use compile time binding
    // we can see here getNmae has three different form(rup)

    public void getName(){
        System.out.println("I have no parameter");
    }

    public void getName(int a ){
        System.out.println("I have one int parameter");
    }

    public void getName(String n,String h,int p) {
        System.out.println("I have 2 strings and one int parameter");
    }
    public void getName(double d,double b ){
        System.out.println("I have two double  parameter");

    }

    public static void main(String[] args) {
        polymorphismOverloading pl=new polymorphismOverloading();
        pl.getName();
        pl.getName(45);
        pl.getName(12.11,11.05);
        pl.getName("Mosammat","Begum",90);
    }

}
