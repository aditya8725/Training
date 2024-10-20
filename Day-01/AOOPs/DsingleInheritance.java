
class Animal
{
    void shouting()
    {
        System.out.println("Animal is shouting ... ");
    }
}

class dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is Braking ...");
    }
}

public class DsingleInheritance 
{
    public static void main(String[] args) 
    {
        dog d = new dog();
        d.shouting();
        d.bark();
    }
}

