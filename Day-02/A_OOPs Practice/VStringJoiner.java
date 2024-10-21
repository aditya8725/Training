import java.util.StringJoiner;

public class VStringJoiner
{
    public static void main(String[] args) 
    {
        // StringJoiner joiner = new StringJoiner(",");
        StringJoiner joiner = new StringJoiner(",","[","]");
        joiner.add("Aditya");
        joiner.add("Ranjan");
        joiner.add("Pradhan");
        System.out.println(joiner);
        
    }
}