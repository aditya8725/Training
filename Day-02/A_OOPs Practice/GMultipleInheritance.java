// First Interface

interface Printable 
{
    void print();
}

// Second Interface
interface Showable 
{
    void show();
}

// Class implementing both interfaces

class Demo implements Printable, Showable 
{
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }

}

public class GMultipleInheritance {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.print();
        demo.show();
    }
}