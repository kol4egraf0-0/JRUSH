/* 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zd593 {
    public static void main(String[] args) {

    }

 interface CanFly {
    void fly();
}


    static {
        try {
            reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        try(var br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null){
                if(line.equals("helicopter")){
                    result = new Helicopter();
                    break;
                } else if (line.equals("plane")) {
                    int value = Integer.parseInt(br.readLine());
                    result = new Plane(value);
                    break;
                }
            }
            System.out.println(result.getClass());
        }
    }
    class Plane implements CanFly{
    private int passangers;

    public Plane(int passangers) {
        this.passangers = passangers;
    }

    @Override
    public void fly() {

    }
}
class Helicopter implements CanFly{
    @Override
    public void fly() {

    }
}

}
*/
