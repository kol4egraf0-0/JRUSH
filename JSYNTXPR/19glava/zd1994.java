import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class zd1994 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Этот элемент равен null";
        list.stream().forEach(string -> System.out.println(Optional.ofNullable(string).orElse(text)));
    }
}
