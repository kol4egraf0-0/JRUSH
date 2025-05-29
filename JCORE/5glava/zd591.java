import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 
public class zd591 {
    public static void main(String[] args) throws IOException{

    }
     interface Planet {
    static String SUN  = "sun";
    static String MOON  = "moon";
    static String EARTH  = "eart";
}


    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        try(var br = new BufferedReader(new InputStreamReader(System.in))) {
           String line = br.readLine();
           switch (line){
               case Planet.EARTH -> thePlanet = Earth.getInstance();
               case Planet.MOON -> thePlanet = Moon.getInstance();
               case Planet.SUN -> thePlanet = Sun.getInstance();
               default -> thePlanet = null;
           }
           System.out.println(thePlanet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    class Earth implements Planet{
    public static Earth INSTANCE;

    public Earth() {}

    public static Earth getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Earth();
        }
        return INSTANCE;
    }
}

    class Sun implements Planet{
    public static Sun INSTANCE;

    public Sun() {}

    public static Sun getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Sun();
        }
        return INSTANCE;
    }
}
    class Moon implements Planet{
    public static Moon INSTANCE;

    public Moon() {}

    public static Moon getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Moon();
        }
        return INSTANCE;
    }
}
}

*/
