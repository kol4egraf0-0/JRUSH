import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class zd1694 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filePath)) {
                for(Path paths : directoryStream) {
                    if(Files.isRegularFile(paths)) {
                        Path sourceFile = paths;
                        paths = fileNewPath.resolve(paths.getFileName());
                        System.out.println(paths);
                        Files.copy(sourceFile, paths);
                        //Files.move(sourceFile, paths); попизже
                    }
            }
        }
    }
}
