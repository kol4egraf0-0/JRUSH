import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class zd1693 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
       try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directory)) {
           for (Path path : directoryStream) {
               if(Files.isDirectory(path)) {
                   System.out.println(path + " is a directory");
               } else if (Files.isRegularFile(path)) {
                   System.out.println(path + " is a file");
               }
           }
       }
    }
}
