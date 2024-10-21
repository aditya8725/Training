import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TSreamAPI4 
{
    public static void main(String[] args) 
    {
        List<Integer> num = Arrays.asList(11,22,33,55,44,77,88);
        List<Integer> num1 = num.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers is : "+num1);
        
    }
    
}
