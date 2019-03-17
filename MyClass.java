/*
 * MyClass
 *
 * V.1
 *
 * Sadovskaya
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Мой класс для пользователей системы.
 * @version 1.0
 */
  public class MyClass {
    /**
     * Создание Map.
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Введите login для "
                + "пользователя 1");
        Scanner scan = new Scanner(System.in);
        String loginFirst = scan.nextLine();

        System.out.println("Введите password для "
                + "пользователя 1");
        Scanner scanPassword = new Scanner(System.in);
        String passwordFirst = scanPassword.nextLine();


        System.out.println("Введите login для "
                + "пользователя 2");
        Scanner scanLoginS = new Scanner(System.in);
        String loginSecond = scanLoginS.nextLine();

        System.out.println("Введите password для "
                + "пользователя 2");
        Scanner scanPasswordS = new Scanner(System.in);
        String passwordSecond = scanPasswordS.nextLine();

        System.out.println("Введите login для"
                + " пользователя 3");
        Scanner scanLoginT = new Scanner(System.in);
        String loginThird = scanLoginT.nextLine();

        System.out.println("Введите password для "
                + "пользователя 3");
        Scanner scanPasswordT = new Scanner(System.in);
        String passwordThird = scanPasswordT.nextLine();


        Map<String, String> users = new HashMap<>();
        users.put(loginFirst, passwordFirst);
        users.put(loginSecond, passwordSecond);
        users.put(loginThird, passwordThird);

        for (Map.Entry<String, String> entry: users.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("Количество пользователей "
               + users.size());

        System.out.println("Введите login для получения "
               + "password");
        Scanner scanLoginX = new Scanner(System.in);
        String loginX = scanLoginX.nextLine();
        System.out.println(users.get(loginX));

    }
}
