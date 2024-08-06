import java.util.Scanner;

public class seminar2Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n: ");
        int n = iScanner.nextInt();
        Stroka(n);
        iScanner.close();
    }
    
    /**
     * @apiNote доп. описание
     * @param n - начальное значение
     * @return произведение минус сумма
     */
    private static void Stroka(int n) {
        String str = "c1";
        for (int i = 0; i < n/2; i++) {
            str += "c2";
            if (n-i > 0) {
                str += "c1";
            }
        }
        System.out.println(str);
    }
}
