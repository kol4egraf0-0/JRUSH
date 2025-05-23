import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class zd19 {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
    Collections.addAll(list, "Привет", "как", "дела?");
    Collections.sort(list, new StringLengthComparator());
    System.out.println(list);
    }
}
class StringLengthComparator implements Comparator<String> {
    public int compare (String obj1, String obj2)
    {
        return obj1.length() - obj2.length();
    }
}