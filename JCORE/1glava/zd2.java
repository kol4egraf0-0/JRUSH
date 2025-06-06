public class zd2 {
public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }
        int min = inputArray[0];
        int max = inputArray[0];
        
        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] < min) {
                min = inputArray[i];
            }
        }

        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] > max) {
                max = inputArray[i];
            }
        }

        return new Pair(min, max);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
