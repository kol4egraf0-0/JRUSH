import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class zd1696 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        InputStream is = url.openStream();
        byte[] buf = is.readAllBytes();
        String s = new String(buf);
        System.out.println(s);
    }
}
