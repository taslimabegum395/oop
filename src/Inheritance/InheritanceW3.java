package Inheritance;

public class InheritanceW3 {

        protected String brand = "Ford";        // Vehicle attribute
        public void honk() {                    // Vehicle method
            System.out.println("Tuut, tuut!");
        }
    }

    class Car5 extends InheritanceW3 {
        private String modelName = "Mustang";    // Car attribute
        public static void main(String[] args) {

            // Create a myCar object
            Car5 myCar = new Car5();
            myCar.honk();



            // Call the honk() method (from the Vehicle class) on the myCar object


            // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
            System.out.println(myCar.brand + " " + myCar.modelName);
        }
    }

