
public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    //напишите тут ваш код
    public Skyscraper(){
       System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int a){
       System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT+a);
    }

    public Skyscraper(String a){
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER+a);
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}


