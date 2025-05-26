import java.io.BufferedReader;
import java.io.InputStreamReader;
interface Person {
    class User implements Person {
        void live() {
            System.out.println("I usually just live.");
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }

    class Coder implements Person {
        void writeCode() {
            System.out.println("I usually write code.");
        }
    }

    class Proger implements Person {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }
}
public class zd46 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while (true)
        {
            key = reader.readLine();
            boolean LL = key.equals("user") || key.equals("loser") ||key.equals("coder") ||key.equals("proger");
            if(!LL) break;
            person = switch (key) {
                case "user" -> new Person.User(); 
                case "loser" -> new Person.Loser();
                case "coder" -> new Person.Coder();
                case "proger" -> new Person.Proger();
                default -> person;
            };
            doWork(person); //вызываем doWork
        }
    }

    public static void doWork(Person person) {
        if(person instanceof Person.User){
            ((Person.User) person).live();
        }
        if(person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }
        if(person instanceof Person.Coder){
            ((Person.Coder) person).writeCode();
        }
        if(person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
