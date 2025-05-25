
public class zd31 {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {

        @Override
        public void sleepOnTheFloor() {
        }

        @Override
        public void askForMore(String message) {
            System.out.println("ДАЙТЕ БОЛЬШЕ");
        }

        @Override
        public void sayThankYou() {
            System.out.println("СПАСИБО ЗА ПIВО");
        }

        @Override
        public boolean isReadyToGoHome() {
            return Alcoholic.READY_TO_GO_HOME;
        }
    }
}
