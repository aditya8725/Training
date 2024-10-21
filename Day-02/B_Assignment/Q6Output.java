
class A {
    void m1() {
        System.out.println("class - A- m1 () method");
    }
}
class B extends A {
    @Override
    void m1() {
        System.out.println("class - B- m1 () method");
    }
    void m7() {
        System.out.println("class- B- m7() method");

    }
}

public class Q6Output {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        b.m7();

    }
}



