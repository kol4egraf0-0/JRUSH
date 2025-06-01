import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class zd791 {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try(var br = new BufferedReader(new InputStreamReader(System.in))) {
            String path1 = br.readLine();
            String path2 = br.readLine();
            var brFile1 = new BufferedReader(new FileReader(path1));
            var brFile2 = new BufferedReader(new FileReader(path2));
            String line;
            while ((line = brFile1.readLine())!= null){
                if(line.isEmpty()){
                    break;
                }
                allLines.add(line);
            }
            while ((line = brFile2.readLine())!= null){
                if(line.isEmpty()){
                    break;
                }
                forRemoveLines.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        try {
            new zd791().joinData();
        } catch (CorruptedDataException e) {
            throw new RuntimeException(e);
        }
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)){
            System.out.println(allLines);
            allLines.removeAll(forRemoveLines);
            System.out.println(allLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
    
}
class CorruptedDataException extends IOException {
}