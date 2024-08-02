import java.util.Scanner;

public class seminar1Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n: ");
        int n = iScanner.nextInt();
        int result = getGetSumMinusPr(n);
        System.out.println("result = " + result);
        iScanner.close();
    }
    
    /**
     * @apiNote доп. описание
     * @param n - начальное значение
     * @return произведение минус сумма
     */
    private static int getGetSumMinusPr(int n) {
    int sum = 0;
        int pr = 1;
        while (n!=0) {
            sum+= n % 10;
            pr*= n % 10;
            n /= 10;
        }
        return pr - sum;
    }
        
}   
