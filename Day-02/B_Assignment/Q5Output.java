class TestMain {
    void add(int a, int b) {
        System.out.println(a + b);
    }
    void add(double a, double b) {
        System.out.println(a + b);
    }

    void add(double a) {
        System.out.println(a);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
public class Q5Output {
    public static void main(String[] args) {
        TestMain testmain = new TestMain();
        testmain.add(10.5);
        testmain.add(10.5, 11.5);
        testmain.add(2, 4);
        testmain.add(5, 10, 15);
    }
}