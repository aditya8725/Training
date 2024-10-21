import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TStreamAPI3 
{
    public static void main(String[] args) 
    {
        List<String> list = Arrays.asList("Adi","Zaid","King","Charlie","Bun","Joy");
        List<String> list1=list.stream().sorted().collect(Collectors.toList());
        System.out.println("The Sorted Order is: "+list1);
    }
    
}
