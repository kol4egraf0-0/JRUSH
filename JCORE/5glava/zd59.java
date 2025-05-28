import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zd59 {
    public static void main(String[] args) throws IOException {
        try(var br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals("exit")) {
                    break;
                }
                try {
                    double value = Double.parseDouble(line);
                    if (value == (int) value) {
                        if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                            print((short) value);
                        } else {
                            print((int) value);
                        }
                    } else {
                        print(value);
                    }
                } catch (NumberFormatException e) {
                    print(line);
                }
                }
            }
        }


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
