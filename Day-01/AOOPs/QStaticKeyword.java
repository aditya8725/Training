class Student {
    int rollno;
    String name;
    static String college = "KIIT";// static variable

    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

public class QStaticKeyword {
    public static void main(String args[]) {
        Student s1 = new Student(111, "Aditya ");
        Student s2 = new Student(222, "Ranjan");
        s1.display();
        s2.display();
    }
}
