import java.util.Objects;

public class User {
   private String name;
   private int age;

   public User() {
   }

   public String getName() {
      return this.name;
   }

   public int setName(String name) {
      if (name == null) {
         return -1;
      } else if (name.isEmpty()) {
         return -2;
      } else if (name.matches(".*\\d.*")) {
         return -3;
      } else {
         this.name = name;
         return 0;
      }
   }

   public int getAge() {
      return this.age;
   }

   public int setAge(int age) {
      if (age < 0) {
         return -1;
      } else if (age > 150) {
         return -2;
      } else {
         this.age = age;
         return 0;
      }
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof User)) {
         return false;
      } else {
         User user = (User)o;
         return Objects.equals(this.getName(), user.getName());
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.getName()});
   }
}
