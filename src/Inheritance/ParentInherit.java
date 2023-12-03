package Inheritance;
    class parent{
        void display(int a){

            System.out.println(a);
        }}
    class Child01 extends parent  {
        void show(int b) {

            System.out.println(b);
        }}
    class Child02 extends parent{
        void display(int c) {

            System.out.println(c);
        }}
class Child03 extends ParentInherit {
    void show(int d) {

        System.out.println(d);
    }}
    public class ParentInherit {

        public static void main(String[] args) {
            Child01 child01 = new Child01();
            child01.show(1);
            Child02 child02= new Child02();
            child02.display(11);
            Child03 child03= new Child03();
            child03.show(15);
        }}
