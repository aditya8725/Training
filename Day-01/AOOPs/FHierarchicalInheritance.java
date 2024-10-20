// Base Class

class Animal2 {
    void eat2() {
        System.out.println("Eating...");
    }
}

class Dog2 extends Animal2 {
    void bark2() {
        System.out.println("Barking...");
    }
}

class Cat2 extends Animal2 {
    void meow2() {
        System.out.println("Meowing...");
    }
}

public class FHierarchicalInheritance {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        Cat2 cat = new Cat2();
        dog.eat2();
        dog.bark2();
        cat.eat2();
        cat.meow2();
    }
}
