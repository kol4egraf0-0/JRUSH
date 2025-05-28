import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class zd592 {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        Map<String, String> params = new HashMap<>();

        String[] parts = url.split("\\?");
        if(parts.length >1){
            String query = parts[1];
            for (String param : query.split("&")) {
                String[] pair = param.split("=");
                if (pair.length == 2) {
                    params.put(pair[0], pair[1]);
                }
                if(pair.length == 1){
                    params.put(pair[0], null);
                }
            }
            for(var pair : params.entrySet()){
                if (pair.getKey().equals("obj")) {
                    alert(Double.parseDouble(pair.getValue()));
                    alert(pair.getKey());
                }
                else{
                    System.out.println(pair.getKey());
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
