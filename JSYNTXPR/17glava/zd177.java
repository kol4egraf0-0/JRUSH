import java.time.LocalTime;

public class zd177 {
    static LocalTime timeMax = LocalTime.MAX;
    static LocalTime timeMin = LocalTime.MIN;
    static LocalTime time1 = LocalTime.MIDNIGHT;
    static LocalTime time2 = LocalTime.of(7, 0, 8);
    static LocalTime time3 = LocalTime.of(0, 45,0,61);
    static LocalTime time4 = LocalTime.of(14, 0, 45, 1001);

    public static void main(String[] args) {
        LocalTime next = method(time1);
        while(next.isAfter(time1)){
            System.out.println(next);
            next = method(next);
        }
    }

    private static LocalTime method(LocalTime base) {
        return base.plusMinutes(288);
    }
}
