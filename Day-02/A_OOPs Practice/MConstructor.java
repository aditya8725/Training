
class Person {
    String name;
    int age;
    // Default Constructor
    public Person() {
        name = "Unknown";
        age = 0;
    }
    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class MConstructor {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.display(); // Outputs: Name: Unknown, Age: 0
        Person person2 = new Person("Alice", 30);
        person2.display(); // Outputs: Name: Alice, Age: 30
    }
}
