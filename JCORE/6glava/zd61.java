public class zd61 {
    public static class TestThread extends Thread{

        static {
            System.out.println("static block it is");
        }

        @Override
        public void run() {
            System.out.println("its a run method");
        }
    }
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.start();
    }
}