// Дан массив целых чисел. Верно ли, что массив является симметричным.

import java.util.Scanner;

public class seminar1Task4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите размер массива:");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    System.out.println("Введите значения массива:");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = scanner.nextInt();
    }
    scanner.close();

    boolean flag = true;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != arr[arr.length-1-i]) {
            flag = false;
        }
    }
    if(flag) {
        System.out.println("симметричный");
    } else {
        System.out.println("Не симметричный");
    }

    System.out.println("Массив выглядит так:");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + ",");
    }
    }
}