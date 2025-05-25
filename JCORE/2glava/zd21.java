public class zd21 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }      

    public static class Cat extends Pet{   
        @Override
        public String getName(){
            return "кот"; 
        }
        @Override            
        public Pet getChild(){
            return null;
        }    
    }

    public static class Dog extends Pet{
        @Override
          public String getName(){
            return "кот"; 
        } 
    
        @Override
        public Pet getChild(){
            return null;
        }     
    }
   
}
