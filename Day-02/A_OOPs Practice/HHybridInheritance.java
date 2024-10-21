interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Mammal {
    void sleep() {
        System.out.println("Mammal is sleeping");
    }
}

// Dog class demonstrates hybrid inheritance by implementing multiple interfaces
// and extending a class

class Dog extends Mammal implements Animal, Pet {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

public class HHybridInheritance 
{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // From Animal interface
        dog.play(); // From Pet interface
        dog.sleep(); // From Mammal class

    }

}