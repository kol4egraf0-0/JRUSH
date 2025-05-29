import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class zd598 {
     public static List<String> lines = new ArrayList<String>();
    public static String path;
    static {
        path = Statics.FILE_NAME;
        try {
            var br = new BufferedReader(new FileReader(path));
            String line;
            while((line = br.readLine())!=null){
                if (line.trim().isEmpty()) {
                    break;
                }
                lines.add(line);
            }
            System.out.println(lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(path);
    }
    public class Statics {
    public static String FILE_NAME = "D:\\ogogo.txt";
}
}
