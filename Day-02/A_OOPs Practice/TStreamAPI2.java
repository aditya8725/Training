import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TStreamAPI2 
{
    public static void main(String[] args) 
    {
        List<Integer> sq = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> sq1 = sq.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println("The square is: "+sq1);
        
    }
    
}
