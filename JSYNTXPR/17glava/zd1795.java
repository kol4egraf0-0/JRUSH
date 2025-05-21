import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class zd1795 {
    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String text = dateTimeFormatter.format(zonedDateTime);
        System.out.println(text);
    }
}
