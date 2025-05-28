public class zd58 {
    public static Cat cat;

    public static void main(String[] args) {

    }

    public static class Cat{
        public String name;


    }

    static {
        zd58.cat = new Cat();
        cat.name = "pog";
        System.out.println(cat.name);
    }
}
