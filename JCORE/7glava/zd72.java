import java.util.ArrayList;
import java.util.List;

public class zd72 {
    public static void main(String[] args) {

    }

    public static  class Garden {

        public final List<String> fruits = new ArrayList<String>();
        public final List<String> vegetables = new ArrayList<String>();

        public synchronized void addFruit(int index, String fruit){
            fruits.add(index, fruit);
        }
        public synchronized  void removeFruit(int index){
            fruits.remove(index);
        }
        public synchronized void addVegetable(int index, String fruit){
            vegetables.add(index, fruit);
        }
        public synchronized void removeVegetable(int index){
            vegetables.remove(index);
        }
    }
}
class President {
    private static President president;


    static {
        synchronized (President.class){
            president = new President();
        }
    }

    public static President getPresident() {
        return president;
    }
}
 class IMF {
    private static IMF imf;

    public static synchronized IMF getFund(){
        if(imf == null){
            imf = new IMF();
        }
        return imf;
    }

    private IMF() {

    }
 }