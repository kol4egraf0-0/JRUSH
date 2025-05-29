public class zd6 {
    public static class TestThread implements Runnable{
        @Override
        public void run() {
            System.out.println("lol");
        }
    }
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        new Thread(testThread).start();
    }
}
