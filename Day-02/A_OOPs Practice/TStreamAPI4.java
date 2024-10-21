import java.util.Arrays;
import java.util.List;

public class TStreamAPI4 
{
    public static void main(String[] args) 
    {
        List<Integer> l1 = Arrays.asList(1,2,44,5,6,99,101,12);
        Integer l2 = l1.stream().max((x,y)-> x.compareTo(y)).get();
        System.out.println("Max: "+l2);

        Integer l3 = l1.stream().min((x,y)-> x.compareTo(y)).get();
        System.out.println("Min: "+l3);
        
    }
}
