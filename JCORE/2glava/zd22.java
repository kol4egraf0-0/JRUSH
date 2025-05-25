public class zd22 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        if(o instanceof Cat){
            if(o instanceof Tiger){
                return "Тигр";
            }
            if(o instanceof Lion){
                return "Лион";
            }
            return "Кот";
        }
        if(o instanceof Bull){
            return "Бык";
        }
        if(o instanceof Cow){
            return "Корова";
        }
        return "Животное";
    }

    public static class Cat extends Animal
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
