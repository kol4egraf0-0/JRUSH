public class zd694 {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            while (!isInterrupted() && numSeconds!=0){
                try {
                    System.out.println(numSeconds);
                    Thread.sleep(1000);
                    numSeconds--;
                    if(numSeconds==0){
                        System.out.println("Марш");
                    }
                } catch (InterruptedException e) {
                    if(numSeconds!=-1){
                        System.out.println("Преравно");
                        break;
                    }
                }
            }
        }
    }
}
