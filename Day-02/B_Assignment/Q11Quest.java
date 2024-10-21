interface Addition {
    int add(int x, int y);
}

interface Subtraction {
    int sub(int x, int y);
}

public class Q11Quest {
    public static void main(String[] args) {
        Addition add = (int a, int b) -> (a + b);
        System.out.println(add.add(20, 30));
        Subtraction sub = (int a, int b) -> (a - b);
        System.out.println(sub.sub(10, 5));
    }
}