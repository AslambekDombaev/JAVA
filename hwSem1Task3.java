
class Calculator {
    public double calculate(char op, int a, int b) {
        double res = 0;
        if (op == '+') {
            res = a + b;
            return res;
        }
        if (op == '-') {
            res = a - b;
            return res;
        }
        if (op == '*') {
            res = a * b;
            return res;
        }
        if (op == '/') {
            res = a / b;
            return res;
        }
    
    
    }
}
    
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hwSem1Task3{ 
    public static void main(String[] args) { 
        int a = 0;
        char op = ' ';
        int b = 0;
    
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 7;
            op = '+';
            b = 3;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }
           // Ниже добавить проверку оператора на корректность
    
    
        double result = calculate(op, a, b);
        System.out.println(result);
    }
}
