package Inheritance;
class BaseClassOverride {
    private static void display() {
        System.out.println("static method from base");
    }
    public void print() {
        System.out.println("non static or instance from base");
    }
    static class Derived extends BaseClassOverride {
        private static void display() {
            System.out.println(" I'm private static method from derived class");
        }
        public void print() {
            System.out.println("I'm non static method from derived class");
        }
        public class test {
            public static void main(String args[]) {
                BaseClassOverride obj = new Derived();
                obj.display();
                obj.print();
            }
        }}}

