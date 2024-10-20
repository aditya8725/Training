
abstract class Animal {
    abstract void makeSound();

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class KAbstraction {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Outputs "Dog barks"
        myCat.makeSound(); // Outputs "Cat meows"
        myDog.eat(); // Outputs "This animal eats food."
        myCat.eat(); // Outputs "This animal eats food."
    }
}
