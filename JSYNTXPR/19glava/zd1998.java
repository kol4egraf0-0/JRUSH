import java.util.Map;
import static java.util.stream.Collectors.toMap;
import java.util.stream.Stream;

public class zd1998 {
    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
        //напишите тут ваш код
        return stringStream
                .collect(toMap(e-> e, e->e.length()));
    }
}
