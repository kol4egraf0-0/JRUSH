import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zd49 {
    public static void main(String[] args) throws IOException {
        try(var br = new BufferedReader(new InputStreamReader(System.in))){
            int fNum = Integer.parseInt(br.readLine());
            int lNum = Integer.parseInt(br.readLine());
            int c = Math.min(fNum,lNum);
            int d = 1;
            for(int i=2;i<=c;i++){
                if(fNum%i==0&& lNum%i==0){
                    d = i;
                }
            }
            System.out.println(d);
        }
    }
}
