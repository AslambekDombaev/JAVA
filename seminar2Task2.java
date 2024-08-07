// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.
// выход: abcd

import java.util.Scanner;

public class seminar2Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        scanner.close();
        
        StringBuilder b = new StringBuilder();
        b.append(a.charAt(0));

        for (int i = 0; i < a.length()-1; i++) {
            if (a.charAt(i) != a.charAt(i + 1)) {
                b.append(a.charAt(i+1));
            }
        }
        System.out.print(b.toString());
    }
}
