import java.util.Scanner;

public class seminar2Task1 {
    public static void main(String[] args) {
    //     Scanner iScanner = new Scanner(System.in);
    //     System.out.printf("int n: ");
    //     int n = iScanner.nextInt();
    //     Stroka(n);
    //     iScanner.close();
    // }
    
//     private static void Stroka(int n) {
//         String str = "c1";
//         for (int i = 0; i < n/2; i++) {
//             str += "c2";
//             if (n-i > 0) {
//                 str += "c1";
//             }
//         }
//         System.out.println(str);
//     }
// }
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n: ");
        int n = iScanner.nextInt();
        String c1 = "c1";
        String c2 = "c2";
        String res = "";
        res = getStrofChars(n, c1, c2);
        System.out.println("res = " + res);
        iScanner.close(); 
    }
    private static String getStrofChars(int n, String c1, String c2) throws Exception {
        if (n < 0 || n%2 == 1) {
            throw new Exception("Не валидное значение N");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
                sb.append(c1).append(c2);
            }
        return sb.toString();
    }
}