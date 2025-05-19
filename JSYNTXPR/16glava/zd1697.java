import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class zd1697 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://httpbin.org/post");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        try (OutputStream output = connection.getOutputStream();
            PrintStream sender = new PrintStream(output)){
            sender.println("ку");
        }

        int a = connection.getResponseCode();
        System.out.println(a);



        try (InputStream input = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
