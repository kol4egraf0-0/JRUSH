import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class zd38 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String path = br.readLine();

            try(FileWriter writer = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(writer)) {
                String words = "";
                while (!(words.equals("exit"))){
                    words = br.readLine();
                    bw.write(words+"\n");
                }
            }
        }
    }
}
