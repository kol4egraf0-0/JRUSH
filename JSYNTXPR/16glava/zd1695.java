import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class zd1695 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        URL url = new URL(line);
        InputStream inputStream = url.openStream();
        byte[] buffer = inputStream.readAllBytes();
        Path tempFile = Files.createTempFile(Paths.get("D:\\LL"),"temp", ".png");
        Files.write(tempFile, buffer);
    }
}
