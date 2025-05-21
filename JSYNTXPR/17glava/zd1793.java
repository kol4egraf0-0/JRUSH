import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zd1793 {
    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Zulu");
        ZoneId zone2 = ZoneId.of("Etc/GMT+8");
        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));

        LocalDateTime time = changeZone(LocalDateTime.of(2025, 5, 20, 23, 51), zone1, zone2);
        System.out.println(time);
    }

    static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        ZonedDateTime from = fromDateTime.atZone(fromZone);
        ZonedDateTime to = from.withZoneSameInstant(toZone);
        return to.toLocalDateTime();
        //return from.withZoneSameLocal(toZone).toLocalDateTime();
    }
}
