import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q8Output {

    public static void main(String[] args) {

        List<String> name = Arrays.asList("Aniruddha", "Pravin", "Amit", "Arvind", "Swaraj", "Babasaheb", "Cat",
                " Extream", "Lemon");

        List<String> name1 = name.stream().filter(i -> i.startsWith("A")).collect(Collectors.toList());

        System.out.println(" The names starting with character A is :- " + name1);

    }
}