
/* StringBuilder
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //
         StringBuilder lol = new StringBuilder(string);
        for(int i=0; i<strings.length; i++){
            lol.append(strings[i]);
        }
        return lol;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        //
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.replace(start, end, str);
    }
}


/*
Разворот строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        //
        StringBuilder lol = new StringBuilder(string);
        lol.reverse();
        String result = lol.toString();
        return result;
    }
}