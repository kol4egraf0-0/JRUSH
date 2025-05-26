import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zd47 {
    public static void main(String[] args) throws IOException {
        try(var br = new BufferedReader(new InputStreamReader(System.in))) {
            Movie movie = null;
            String key;
            String line;
            while (true)
            {
                key = br.readLine();
                boolean LL = key.equals("soapOpera") || key.equals("thriller") ||key.equals("cartoon");
                if(!LL) break;
                switch (key) {
                    case "soapOpera": movie = new SoapOpera();  break;
                    case "thriller": movie = new Cartoon(); break;
                    case "cartoon": movie = new Thriller(); break;
                }
                MovieFactory.getMovie(key);
                System.out.println(movie.getClass().getSimpleName());
            }

        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{

    }

    static class Thriller extends Movie{

    }
}
