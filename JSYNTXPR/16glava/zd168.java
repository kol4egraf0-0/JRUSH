import java.nio.file.Path;
import java.util.Scanner;

public class zd168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //напишите тут ваш код
        Path path = Path.of(str);
        if(!path.isAbsolute()) {
            path = path.toAbsolutePath();
        }
        System.out.println(path);
    }
}
