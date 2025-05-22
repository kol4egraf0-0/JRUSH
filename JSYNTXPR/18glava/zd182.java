/*import java.util.ArrayList;
import java.util.List;

public class zd182 {
    static List<MusicallInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        orchestra.add(new Organ());
        orchestra.add(new Pianino());
        orchestra.add(new Pianino());
        orchestra.add(new Pianino());
    }

    public static void createStringedOrchestra() {
        orchestra.add(new Violin());
        orchestra.add(new Violin());
        orchestra.add(new Guitar());
    }

    public static void playOrchestra() {
        for(MusicallInstrument ins : orchestra) {
            ins.play();
        }
    }
}

public class Pianino implements MusicallInstrument{
    @Override
    public void play() {
        System.out.println("Pianino");
    }
}

public class Guitar implements MusicallInstrument{
    @Override
    public void play() {
        System.out.println("Guitar");
    }
}

public class Organ implements MusicallInstrument{
    @Override
    public void play() {
        System.out.println("Organ");
    }
}

public class Violin implements MusicallInstrument{
    @Override
    public void play() {
        System.out.println("Violin");
    }
}

public interface MusicallInstrument {
    void play();
}
*/
