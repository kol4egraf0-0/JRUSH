import java.util.ArrayList;
import java.util.Collections;

public class zd194 {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Ты", "ж", "программист");

        var integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1000, 2000, 3000);


        String[] stringArray = toStringArray(strings);
        for (String string : stringArray) {
            System.out.println(string);
        }

        Integer[] integerArray = toIntegerArray(integers);
        for (Integer integer : integerArray) {
            System.out.println(integer);
        }
    }

    public static String[] toStringArray(ArrayList<String> strings) {
        //напишите тут ваш код
        return new String[]{};
    }

    public static Integer[] toIntegerArray(ArrayList<Integer> integers) {
        //напишите тут ваш код
        return new Integer[]{};
    }
}
