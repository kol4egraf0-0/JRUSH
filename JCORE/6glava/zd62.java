import java.util.ArrayList;
import java.util.List;

public class zd62 {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        int i = 0;
        while (i!=5){
            SpecialThread task = new SpecialThread();
            list.add(new Thread(task));
            i++;
        }
        System.out.println(list);
    }

    public static class SpecialThread implements Runnable {
        @Override
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
