import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;


public class zd162 {
public static void main(String[] args)  {
    try (Scanner sc = new Scanner(System.in)) {
        String path = sc.nextLine();
        List<String> lines = Files.readAllLines(Path.of(path));
            for(int i = 0; i < lines.size(); i++){
                if(i%2==0){
                    System.out.println(lines.get(i));
                }
            }
       }
    catch (Exception e){
        e.printStackTrace();
    }
    }
}
