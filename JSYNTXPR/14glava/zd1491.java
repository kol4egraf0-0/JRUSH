/* 
public class zd1491 {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        //напишите тут ваш код
        Month[] months = Month.values();
        int index = month.ordinal();
        if(index ==11){
            return Month.JANUARY;
        }
        Month monthToReturn = Month.values()[index+1];
        return monthToReturn;
    }
}
public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        JavarushQuest[] jqs = JavarushQuest.values();
        for(int i =0; i < jqs.length; i++){
            System.out.println(jqs[i].ordinal());
        }
    }
}
    */
/* 
public enum JavarushQuest {
    JAVA_SYNTAX,
    JAVA_CORE,
    JAVA_MULTITHREADING,
    JAVA_COLLECTIONS,
    CS_50,
    ANDROID,
    GAMES
}

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}
    */