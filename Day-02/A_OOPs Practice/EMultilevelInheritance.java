
class Animal1
{
    void eat()
    {
        System.out.println("Eating ...");
    }
}

class Dog1 extends Animal1
{
    void bark1()
    {
        System.out.println(("Barking"));
    }
}

class puppy extends Dog1
{
    void weep()
    {
        System.out.println("Puppy is weeping");
    }
}

public class EMultilevelInheritance 
{
    public static void main(String[] args) 
    {
        puppy p = new puppy();
        p.eat();
        p.bark1();
        p.weep();
    }
}
