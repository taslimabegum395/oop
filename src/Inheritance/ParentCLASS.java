package Inheritance;



//  Class 1
// First Parent class
    class Parent1 {

        // Method inside first parent class
        void fun() {

            // Print statement if this method is called
            System.out.println("Parent1");
        }
    }

    // Class 2
// Second Parent Class
    class Parent2 {

        // Method inside first parent class
        void fun() {

            // Print statement if this method is called
            System.out.println("Parent2");
        }


    // Class 3
// Trying to be child of both the classes
   // class Test extends Parent1,Parent2 {

        // Main driver method
        public static void main(String args[]) {

         //   // Creating object of class in main() method
          //  Test t = new Test();

            // Trying to call above functions of class where
            // Error is thrown as this class is inheriting
            // multiple classes
           // t.fun();
        }
    }
   // Output: Compilation error is thrown

