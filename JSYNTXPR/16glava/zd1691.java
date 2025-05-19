
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Еще раз читаем из консоли
*/

public class zd1691 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Files.isDirectory(Path.of(str));
        while (!(Files.isDirectory(Path.of(str))) || !(Files.isRegularFile(Path.of(str))) ) {
            if(Files.isDirectory(Path.of(str))){
                System.out.println(str + " - это директория");
                str = scanner.nextLine();
            } else if(Files.isRegularFile(Path.of(str))){
                System.out.println(str + " - это файл");
                str = scanner.nextLine();
            }
            else {
                System.out.println(str + " - ничего так то!");
                break;
            }
        }
    }
}