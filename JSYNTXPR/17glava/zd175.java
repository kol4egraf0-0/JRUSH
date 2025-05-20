import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class zd175 {
    
    static LocalDate bithDay = LocalDate.of(2020,3,12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(bithDay));
    }

    private static String getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.forLanguageTag("ru"));
    }
}
