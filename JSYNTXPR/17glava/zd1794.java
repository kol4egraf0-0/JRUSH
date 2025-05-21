import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

public class zd1794 {
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;
    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());
        
        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        return new TreeSet<>(ZoneId.getAvailableZoneIds());
    }

    static ZonedDateTime getBeijingDateTime() {
        zoneId = ZoneId.of("Asia/Shanghai");
        return ZonedDateTime.now(zoneId);
    }
}
