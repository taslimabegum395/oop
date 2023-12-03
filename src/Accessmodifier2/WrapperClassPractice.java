package Accessmodifier2;

public class WrapperClassPractice {
    public static void main(String[] args) {


//primitive>>>object

        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y = " + y);

       // or


        int n = 20;
        Integer h = n;//autoboxing //primitive data dype k object e rupantorito kora
        System.out.println("h = " + h);

        //object >>>>primitive data type

Double d= new Double(5.5);
        System.out.println("d = "+d);


//now d ai object k primitive data type e ropantorito korbo
      //  double e=d.doubleValue();
        //or

          double e=d;//unboxing
        System.out.println("e + "+ e);




    }
}
//Wrapper classes are used to convert primitive into object and objec tinto primitive
//AutoBoxing= converting primitive to  Object
//unboxing= converting Object to  primitive
//Primitive Data Type	    Wrapper Class
//byte	                    Byte
//short	                    Short
//int	                    Integer
//long	                    Long
//float	                    Float
//double	                Double
//boolean	                Boolean
//char	                    Character