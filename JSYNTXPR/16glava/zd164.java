import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Еще раз читаем из консоли
*/

public class zd164 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in))
        {
            String line = sc.nextLine();
            char[] chars = line.toCharArray();
            Set<Character> characters = new HashSet<>();
            for (char aChar : chars) {
                if (Character.isAlphabetic(aChar)) {
                    characters.add(Character.toLowerCase(aChar));
                }
            }
            System.out.println(characters);
        }
    }
}