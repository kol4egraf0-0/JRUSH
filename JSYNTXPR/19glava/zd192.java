/* 
import java.util.ArrayList;
import java.util.Collections;

public class zd192 {
     public static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        Collections.addAll(students,
                new Student("Петька", 28),
                new Student("Сидоров",21),
                new Student("Борис", 21));

        Collections.sort(students, new AgeComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int a = o1.getAge() - o2.getAge();
        if (a == 0) {
            return 0;
        }
        return a;
    }
}
*/