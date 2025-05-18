import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class zd161 {
    public static void main(String[] args) throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try (Scanner sc = new Scanner(System.in))
        {
              input = new FileInputStream(sc.nextLine());
              output = new FileOutputStream(sc.nextLine());
              byte[] bytesIn = input.readAllBytes();
              byte[] bytesOut = new byte[bytesIn.length];
              for (int i = 0; i < bytesIn.length; i+=2){
                  if(i<bytesIn.length-1){
                      bytesOut[i] = bytesIn[i+1];
                      bytesOut[i+1] = bytesIn[i];
                  }
                  else{
                      bytesOut[i] = bytesIn[i];
                  }
              }
              output.write(bytesOut);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(input != null)
                input.close();
            if(output != null)
                output.close();
        }
    }
}