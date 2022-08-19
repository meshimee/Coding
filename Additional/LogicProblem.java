public class LogicProblem {
          public static void main(String[] args) {
                 int p1 = 30;
                 int p2 = 26;
                 int p3 = 28;
                 int q = 14;
                 int e = 345;
                 int r = 43;
                 
                 int x = e-r + 2*q - p1 - p2 - p3;
                 x /= 3;
                 int first_prblm = x + p1-q + p3-q + q;
                 
                 int second_prblm = 3 * x;

                 System.out.println(first_prblm);
                 System.out.println(second_prblm);
          }
}
