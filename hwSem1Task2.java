
public class hwSem1Task2{ 
    public static void main(String[] args) { 
      
        printPrimeNums(); 
    }

        public static void printPrimeNums() { 
            for (int i = 2; i <= 1000; i++) { 
                if (isPrime(i)) { 
                    System.out.println(i); 
                } 
            } 
        }
        
        public static boolean isPrime(int num) { 
            if (num < 2) { 
                return false; 
            } 
            for (int i = 2; i <= num / 2; i++) { 
            if (num % i == 0) { 
                return false; 
            } 
        } 
        return true; 
    } 
}

