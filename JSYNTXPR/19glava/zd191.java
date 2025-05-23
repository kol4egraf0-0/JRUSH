/* 
import java.util.ArrayList;

public class zd191 {
    public static ArrayList<Runnable> list = new ArrayList<>();
    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    private static void addToList(Runnable runnable) {
        list.add(runnable);
    }
    private static void runList() {
        for(Runnable runs : list) {
            runs.run();
        }
    }
}

public interface Runnable {
    void run();
}

public class Plane implements Runnable {

    @Override
    public void run() {
        System.out.println("Plane is running");
    }
}

public class Car implements Runnable {
    @Override
    public void run() {
        System.out.println("Car is running");
    }
}
    */

