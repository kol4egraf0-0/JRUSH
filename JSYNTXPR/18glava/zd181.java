public class zd181 {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a,b), max(c,d));
    }

    public static int max(int a, int b, int c, int d, int e) {
        return max(max(a,b), max(c,d), e);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int min(int a, int b, int c) {
        return min(min(a,b),c);
    }

    public static int min(int a, int b, int c, int d) {
        return min(min(a,b), min(c,d));
    }

    public static int min(int a, int b, int c, int d, int e) {
        return min(min(a,b), min(c,d), e);
    }

    public static void main(String[] args) {
        System.out.println(max(3,4));
        System.out.println(min(3,4));
        System.out.println(max(3,4,5));
        System.out.println(min(3,4,5,6));
        System.out.println(min(3,4,5,6,7));
    }
}
