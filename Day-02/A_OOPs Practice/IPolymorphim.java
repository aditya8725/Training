//Overloading

// class Calculator {
//     // Method to add two integers
//     int add(int a, int b) {
//         return a + b;
//     }

//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// public class IPolymorphim {
//     public static void main(String[] args) {
//         Calculator calculator = new Calculator();
//         System.out.println("Sum of 2 & 3: " + calculator.add(2, 3));
//         System.out.println("Sum of 1, 2, & 3: " + calculator.add(1, 2, 3));
//         System.out.println("Sum of 1.1 & 2.2 is: "+calculator.add(10.1, 20.2) );
//     }
// }

class Calculator {
    // Method to add two integers
    void add(int a, int b) {
        System.out.println(a+b);
    }

    void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    void add(double a, double b)
    {
        System.out.println(a+b);
    }

    void add(double a)
    {
        System.out.println(a);
    }
}

public class IPolymorphim {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1, 2);
        calculator.add(1, 2, 3);
        calculator.add(10.1, 20.2);
        calculator.add(1.1);
    }
}