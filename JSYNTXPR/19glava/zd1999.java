import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zd1999 {
    public static void main(String[] args) {
        var stringStream = Stream.of("To", "be", "a", "programmer", "you", "need", "to", "code");

        System.out.println(getString(stringStream));
    }

    public static String getString(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }
}
