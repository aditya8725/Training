//Overloading

class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }
    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class IPolymorphim {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum of 2 & 3: " + calculator.add(2, 3));
        System.out.println("Sum of 1, 2, & 3: " + calculator.add(1, 2, 3));
    }

}