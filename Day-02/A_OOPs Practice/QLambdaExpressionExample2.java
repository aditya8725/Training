// interface addition
// {
//     int add(int x, int y);
// }

// public class QLambdaExpressionExample2 
// {
//     public static void main(String[] args) 
//     {
//         addition sum = (int a,int b)->a+b;
//         System.out.println(sum.add(10,20));
//     }
// }



interface addition{
    int add(int a,int b);
}

public class QLambdaExpressionExample2
{
    public static void main(String[] args) 
    {
        addition a = (x,y)->x+y;
        System.out.println(a.add(1, 2));
        
    }
}