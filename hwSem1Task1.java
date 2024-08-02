class Answer {
  public int countNTriangle(int n) {
    int b = 0;
    if (n < 1) {
      return -1;
    } else {
      for (int i = 0; i < n+1; i++) {
        b += i;
      }
      return b;
    }

  }

  public class Printer {
    public static void main(String[] args) {
      int n = 0;

      if (args.length == 0) {
        n = 4;
      } else {
        n = Integer.parseInt(args[0]);
      }

      Answer ans = new Answer();
      int itresume_res = ans.countNTriangle(n);
      System.out.println(itresume_res);
    }
  }
}
