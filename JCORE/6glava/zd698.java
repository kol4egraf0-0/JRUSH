import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zd698 {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t2.start();
        t1.join();
        t1.printResult();
        t2.join();
        t2.printResult();
    }
    public static class Read3Strings extends Thread{
        StringBuilder sb = new StringBuilder();
        @Override
        public void run() {
            try {
                String line;
                for (int i = 0; i < 3; i++) {
                    line = reader.readLine();
                    sb.append(line).append(" ");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        public void printResult() {
            System.out.println(sb);
        }
    }
}
