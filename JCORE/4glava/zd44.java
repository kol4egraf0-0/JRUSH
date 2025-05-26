interface Country {
    String UKRAINE = "Ukraine";
    String RUSSIA ="Russia";
    String MOLDOVA = "Moldova";
    String BELARUS = "Belarus";
}
abstract class Hen {
    public abstract int getCountOfEggsPerMonth();
    public String getDescription(){
        return "Я - курица";
    }
}
class MoldovaHen extends Hen implements Country {

    @Override
    public int getCountOfEggsPerMonth() {
        return 7;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.MOLDOVA, getCountOfEggsPerMonth());
    }
}
class RussianHen extends Hen implements Country {

    @Override
    public int getCountOfEggsPerMonth() {
        return 4;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.RUSSIA, getCountOfEggsPerMonth());
    }
}
class BelarusHen extends Hen implements Country {

    @Override
    public int getCountOfEggsPerMonth() {
        return 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.BELARUS, getCountOfEggsPerMonth());
    }
}
class UkraineHen extends Hen implements Country{
    @Override
    public int getCountOfEggsPerMonth() {
        return 2;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.UKRAINE, getCountOfEggsPerMonth());
    }
}

public class zd44 {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if(country.equals("Belarus"))
                return new BelarusHen();
            if(country.equals("Russia"))
                return new RussianHen();
            if(country.equals("Moldova"))
                return new MoldovaHen();
            if(country.equals("Ukraine"))
                return new UkraineHen();
            return hen;
        }
    }
}
