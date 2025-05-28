import java.util.HashMap;
import java.util.Map;

public class zd56 {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(3.14, "aaa");
        labels.put(3.15, "aaa");
        labels.put(3.16, "aaa");
        labels.put(3.17, "aaa");
        labels.put(3.18, "aaa");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
