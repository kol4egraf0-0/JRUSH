import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class zd595 {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        BigDecimal res = BigDecimal.ONE;
        if(n<0 || n>150){
            res = BigDecimal.ZERO;
        }
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigDecimal.valueOf(i));
        }

        return res.toString();
    }
}
