
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class OCopyConstructor {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        student1.display(); // Outputs: Name: Alice, Age: 20
        Student student2 = new Student(student1);
        student2.display(); // Outputs: Name: Alice, Age: 20
    }
}
