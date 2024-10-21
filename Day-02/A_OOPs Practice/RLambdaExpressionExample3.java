import java.util.ArrayList;

public class RLambdaExpressionExample3 
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Aditya");
        list.add("Shiva");
        list.add("Rahiul");

        list.forEach((n)->System.out.println(n));   
    }
}