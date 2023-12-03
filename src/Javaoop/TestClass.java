package Javaoop;

public interface TestClass {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="Mosammat";
        teacher.gender="Female";
        teacher.phone=718858167;
       System.out.println("Name: "+ teacher.name);
        System.out.println("Gender: "+teacher.gender);
        System.out.println ("Phone: "+ teacher.phone);

        Teacher teacher2=new  Teacher();
        teacher2.name="Mosammat2";
        teacher2.gender="Female2";
        teacher2.phone=1213331;
        System.out.println("Name: "+ teacher2.name);
        System.out.println("Gender: "+teacher2.gender);
        System.out.println ("Phone: "+ teacher2.phone);

    }
}
