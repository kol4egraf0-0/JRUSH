import java.util.Set;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;

public class zd1997 {
    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getFilteredStrings(stringStream).forEach(System.out::println);
    }

    public static Set<String> getFilteredStrings(Stream<String> stringStream) {
        //напишите тут ваш код
        return stringStream
                .filter(s -> s.length()>6)
                .collect(toSet());
    }
}
