/* 
public class zd73 {
     public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Ivan Ivanov", new Date()));
        allPeople.add(Person.createMale("Petr Petrov", new Date()));
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dfInput = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dfOutput = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        for(int i = 0; i< args.length; i++){
           String arg = args[i];

           if(arg.equals("-c")){
               if(i + 4 < args.length){
                   String name = args[i+2];
                   String sex = args[i+3];
                   Date date = dfInput.parse(args[i+4]);
                   if(sex.equals("m")){
                       allPeople.add(Person.createMale(name, dfOutput.parse(String.valueOf(date))));
                   } else {
                       allPeople.add(Person.createFemale(name, dfOutput.parse(String.valueOf(date))));
                   }
                   System.out.println(allPeople.size()-1);
                   i += 4;
               }
           }


           else if(arg.equals("-r")){
               if(i+2 < args.length){
                   int id = Integer.parseInt(args[i+1]);
                   System.out.println(allPeople.get(id));
                   i+=2;
               }
           }
           else if(arg.equals("-u")) {
               if(i + 5 < args.length) {
                   int id = Integer.parseInt(args[i+2]);
                   String name = args[i + 3];
                   String sex = args[i + 4];
                   Date date = dfInput.parse(args[i + 5]);
                   if(sex.equals("м")){
                       allPeople.set(id, Person.createMale(name, dfOutput.parse(String.valueOf(date))));
                   } else {
                       allPeople.add(id, Person.createFemale(name, dfOutput.parse(String.valueOf(date))));
                   }
                   i+=5;
                   System.out.println("Обновлено!");
               }
           } else if (arg.equals("-d")) {
               if(i+2 < args.length){
                   int id = Integer.parseInt(args[i+1]);
                   System.out.println(allPeople.set(id, new Person(null, null, null)));
                   i+=2;
               }
           }
        }
    }
}
import java.util.Date;

public class Person {
    private String name;
    private Sex sex;
    private Date birthDate;

    public Person(String name, Sex sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public static Person createMale(String name, Date birthDate){
        return new Person(name, Sex.MALE, birthDate);
    }

    public static Person createFemale(String name, Date birthDate){
        return new Person(name, Sex.FEMALE, birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
public enum Sex {
    MALE,
    FEMALE
}
*/