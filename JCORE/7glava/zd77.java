import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class zd77 {
    public volatile static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("I I ", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("P P", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


    public static void main(String[] args) throws Exception {
        if (args == null || args.length < 1) {
            throw new RuntimeException();
        }

        Date birthdayDate;
        Person person;
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    int i = 1;
                    while (i < args.length) {
                        birthdayDate = simpleDateFormat.parse(args[i + 2]);

                        if (args[i + 1].equals("м")) {
                            person = Person.createMale(args[i], birthdayDate);
                        } else {
                            person = Person.createFemale(args[i], birthdayDate);
                        }

                        allPeople.add(person);
                        System.out.println(allPeople.size() - 1);

                        i += 3;
                    }
                }
                break;
            case "-r":
                int j = 1;
                synchronized (allPeople) {
                    while (j < args.length) {
                        person = allPeople.get(Integer.parseInt(args[j]));
                        if (person != null) {
                            System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + simpleDateFormat2.format(person.getBirthDate()));
                        }
                        j++;
                    }
                }
                break;
            case "-u":
                int l = 1;
                synchronized (allPeople) {
                    while (l < args.length) {
                        birthdayDate = simpleDateFormat.parse(args[l + 3]);
                        int id = Integer.parseInt(args[l]);
                        person = allPeople.get(id);
                        if (person == null) {
                            throw new IllegalArgumentException();
                        }
                        person.setSex(getSex(args[l + 2]));
                        person.setBirthDate(birthdayDate);
                        person.setName(args[l + 1]);
                        allPeople.set(id, person);
                        l += 4;
                    }
                }
                break;
            case "-d":
                int k = 1;
                synchronized (allPeople) {
                    while (k < args.length) {
                        Person currentPerson = allPeople.get(Integer.parseInt(args[k]));
                        currentPerson.setName(null);
                        currentPerson.setSex(null);
                        currentPerson.setBirthDate(null);
                        k++;
                    }
                }
                break;
        }

    }

    private static Sex getSex(String sexParam) {
        return sexParam.equals("м") ? Sex.MALE : Sex.FEMALE;
    }
}

class Person {
    private String name;
    private Sex sex;
    private Date birthDate;

    private Person(String name, Sex sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public static Person createMale(String name, Date birthDate) {
        return new Person(name, Sex.MALE, birthDate);
    }

    public static Person createFemale(String name, Date birthDate) {
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
 enum Sex {
    MALE,
    FEMALE
}
