import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class TStreamAPI1
{
    public static void main(String[] args) 
    {
        List<String> name = Arrays.asList("Adi","Shiv","Krish","Aman");
        List<String> name1 = name.stream().filter(i->i.startsWith("A")).collect(Collectors.toList());
        System.out.println("The name starts with A are: - "+name1);
    }
}
