// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

import java.util.Scanner;

public class seminar2Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        boolean flag = getFlag(str);
        System.out.println(flag);
    }

    private static boolean getFlag(String str) {
        boolean flag = true;

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)) {
                flag = false;
                break;
            }   
        }
        return flag;
    }
}
