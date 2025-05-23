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

/*
 * public static void main(String[] args)
    {  ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Привет", "как", "дела?");
        Comparator<String> comparator = new Comparator<String>()  {
            public int compare (String obj1, String obj2)  {
                return obj1.length() - obj2.length();
            }
        };  
        Collections.sort(list, comparator);
        System.out.println(list);
    }
 */

 /*
  * public static void main(String[] args)
    {  ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Привет", "как", "дела?");
        Comparator<String> comparator = (obj1, obj2) -> obj1.length() - obj2.length();
        Collections.sort(list, comparator);
        System.out.println(list);
    }
  */
/*
 * public static void main(String[] args)
    {  ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Привет", "как", "дела?");
        Collections.sort(list, (obj1, obj2) -> obj1.length() - obj2.length());
        System.out.println(list);
    }
 */

 /*
  * public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Привет", "как", "дела?");

        list.forEach( (s) -> System.out.println(s) );
    }
  */