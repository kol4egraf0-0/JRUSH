import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class zd6104 {
    public static List<Thread> threads = new ArrayList<>(5);
    public static void main(String[] args) {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }
    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()){
            }
        }
    }
    public static class Thread2 extends Thread  {
        @Override
        public void run() {
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static class Thread3 extends Thread{
        @Override
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()){
                    Thread.sleep(500);
                    System.out.println("Ура");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static class Thread4 extends Thread implements Message{
        @Override
        public void run() {
            while (!isInterrupted()){
            }
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }
    public static class Thread5 extends Thread{
        String line;
        int sum = 0;
        @Override
        public void run() {
            try(var br = new BufferedReader(new InputStreamReader(System.in))) {
                while ((line = br.readLine())!= null){
                    if(line.equals("N")){
                        break;
                    }
                    sum += Integer.parseInt(line);
                }
                System.out.println(sum);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException e){
                System.out.println("введи число тварь");
            }
        }
    }
}
interface Message {
    void showWarning();
}
