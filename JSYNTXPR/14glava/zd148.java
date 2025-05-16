import java.util.ArrayList;
import java.util.Collections;

/*
ollections, часть 3
*/

public class zd148 {

    public static Integer min(ArrayList<Integer> list) {
         int m = Collections.min(list);
         return m;
    }

    public static Integer max(ArrayList<Integer> list) {
       int m = Collections.max(list);
        return m;
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
      int m =  Collections.frequency(list, element);
            return m;
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
         Collections.sort(list);
        int m = Collections.binarySearch(list, key);
        return m;
    }
}