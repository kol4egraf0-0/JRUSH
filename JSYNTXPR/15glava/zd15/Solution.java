import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
   public static final String INPUT_NAME = "\nВведите имя: ";
   public static final String INPUT_AGE = "Введите возраст пользователя '%s': ";
   public static final String CANNOT_BE_NULL = "Имя не может быть null.";
   public static final String CANNOT_BE_EMPTY = "Имя не может быть пустым.";
   public static final String CANNOT_CONTAIN_DIGIT = "Имя не может содержать цифры.";
   public static final String CANNOT_BE_NEGATIVE = "Возраст не может быть меньше 0.";
   public static final String CANNOT_BE_TOO_BIG = "Возраст не может быть больше 150.";
   public static final String UNKNOWN_ERROR = "Неизвестная ошибка.";
   public static final String FOUND = "\nПользователь '%s' найден под индексом %d.\n";
   public static final String NOT_FOUND = "\nПользователь '%s' не найден.\n";
   static List<User> users = new ArrayList();
   static Scanner scanner;

   public Solution() {
   }

   public static void main(String[] args) {
      for(int i = 0; i < 5; ++i) {
         addUser(new User());
      }

      User userToSearch = new User();
      userToSearch.setName("Пог");
      findUserIndex(userToSearch);
   }

   static void addUser(User user) {
      System.out.print("\nВведите имя: ");
      String name = scanner.nextLine();
      System.out.printf("Введите возраст пользователя '%s': ", name);
      int age = Integer.parseInt(scanner.nextLine());
      int statusName = user.setName(name);
      if (statusName == -1) {
         System.out.println("Имя не может быть null.");
      } else if (statusName == -2) {
         System.out.println("Имя не может быть пустым.");
      } else if (statusName == -3) {
         System.out.println("Имя не может содержать цифры.");
      } else if (statusName != 0) {
         System.out.println("Неизвестная ошибка.");
      }

      int statusAge = user.setAge(age);
      if (statusAge == -1) {
         System.out.println("Возраст не может быть меньше 0.");
      } else if (statusAge == -2) {
         System.out.println("Возраст не может быть больше 150.");
      } else if (statusAge != 0) {
         System.out.println("Неизвестная ошибка.");
      }

      users.add(user);
   }

   static void findUserIndex(User user) {
      int code = users.indexOf(user);
      if (code == -1) {
         System.out.printf("\nПользователь '%s' не найден.\n", user.getName());
      } else {
         System.out.printf("\nПользователь '%s' найден под индексом %d.\n", user.getName(), users.indexOf(user));
      }

   }

   static {
      scanner = new Scanner(System.in);
   }
}