import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q10Output {

    public static void main(String[] args) {
        List<Integer> itr = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 1000);
        List<Integer> itr2 = itr.stream().filter(i -> i > 30).collect(Collectors.toList());
        System.out.println(" This are the numbers greater than 30 :- " + itr2);
    }
}