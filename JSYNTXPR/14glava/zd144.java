import java.util.ArrayList;
import java.util.Collections;

/*
 Collections, часть 1
*/

public class zd144 {

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        Collections.copy(destination,source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list,oldValue,newValue);
    }
}