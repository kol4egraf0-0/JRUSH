import java.util.Scanner;

/*
Минимальное из N чисел
*/

public class zd51 {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
