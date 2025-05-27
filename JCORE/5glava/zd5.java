public class zd5 {

    public static class Goose extends SmallAnimal{
        @Override
        public String getSize() {
            return "Гусь маленький " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal {
        @Override
        public String getSize() {
            return "Дракон большой " + super.getSize();
        }
    }

    public static void main(String[] args) {
        BigAnimal animal = new Dragon();
        SmallAnimal animal1 = new Goose();
        System.out.println(animal1.getSize());
        System.out.println(animal.getSize());
    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}