import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Еще раз читаем из консоли
*/

public class zd165 { //javac zd.java, java zd "LOL", output.txt
    public static void main(String[] args)  {
        byte[] bytes = args[0].getBytes(StandardCharsets.UTF_8);
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream)) {
             Files.write(Path.of(scanner.nextLine()), bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}