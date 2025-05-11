public class Car {
   private Engine engine;
    //напишите тут ваш код
     class Engine{
        private boolean isRunning;

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }
    }
}