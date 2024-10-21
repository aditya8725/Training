interface message
{
    String msg(String msg);
}

public class SLamdbaExpressionExample4 
{
    public static void main(String[] args) 
    {
        message m = (msg)->{
            String s1 = "I would like to say, ";
            String s2 = s1+msg;
            return s2;
        };

        System.out.println(m.msg("Aditya is good"));
    }
}
