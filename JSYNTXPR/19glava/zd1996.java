import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;
public class zd1996 {
    public static void main(String[] args) {
        var numbers = Stream.of(-1, 10, 43, 0, -32, -4, 22);

        getPositiveNumbers(numbers).forEach(System.out::println);
    }

    public static List<Integer> getPositiveNumbers(Stream<Integer> numbers) {
       return numbers
               .filter(n->n>0)
               .collect(toList());
    }
}
