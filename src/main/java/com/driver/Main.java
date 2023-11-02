package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 2: Create an object of the Product class
        Product p = new Product();

        // Task 3: Call the first overloaded product method with two integers
        int result1 = p.product(5, 10);
        System.out.println("Result 1: " + result1);

        // Task 4: Call the second overloaded product method with three integers
        int result2 = p.product(3, 4, 5);
        System.out.println("Result 2: " + result2);

        // Task 5: Call the third overloaded product method with two double values
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result 3: " + result3);
    }
    
   public static class Product {
        // Task 3: Overloaded method with two integers
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with three integers
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with two double values
        public double product(double x, double y) {
            return x * y;
        }
    }
}


