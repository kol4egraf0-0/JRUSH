public class zd6102 {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        while (zd6102.count>createdThreadCount){
            System.out.println(new GenerateThread());
        }
    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super(String.valueOf(createdThreadCount+1));
            createdThreadCount++;
            this.start();
        }

        @Override
        public String toString() {
            return getName() + " created";
        }
    }
}
