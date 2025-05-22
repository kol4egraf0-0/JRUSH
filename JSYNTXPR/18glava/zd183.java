public class zd183 {
    public class Aircraft implements Flyable {
    @Override
    public int getMaxSpeed(){
        return 1200;
    }
}
public interface Flyable {
     int getMaxSpeed();
}
}
