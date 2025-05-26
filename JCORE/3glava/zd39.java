import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class zd39 {
    public static void main(String[] args) throws IOException {
        try(var readerPath = new BufferedReader(new InputStreamReader(System.in));
            var reader = new BufferedReader(new FileReader(readerPath.readLine()))) {
            ArrayList<Integer> list = new ArrayList<>();
            String line;
            while ((line = reader.readLine())!=null) {
                    Integer num = Integer.valueOf(line);
                    if (num % 2 == 0) {
                        list.add(num);
                    }
            }
            Collections.sort(list);
            for(Integer nums: list){
                System.out.println(nums);
            }
        }
    }
}
