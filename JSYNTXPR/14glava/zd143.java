import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
Выводим в консоли элементы множества
*/

public class zd143 {

    public static void print(HashSet<String> words) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}