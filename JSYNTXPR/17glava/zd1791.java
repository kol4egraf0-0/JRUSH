import java.time.Instant;

public class zd1791 {
     public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        Instant max = Instant.ofEpochMilli(Long.MAX_VALUE);
        return max;
    }

    static Instant getMaxFromSeconds() {
        long maxSecond = Instant.MAX.getEpochSecond();
        Instant max = Instant.ofEpochSecond(maxSecond);
        return max;
    }

    static Instant getMaxFromSecondsAndNanos() {
        long maxSecond = Instant.MAX.getEpochSecond();
        long maxNano = Instant.MAX.getNano();
        Instant max = Instant.ofEpochSecond(maxSecond, maxNano);
        return max;
    }
}
