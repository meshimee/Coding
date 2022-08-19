public class Armstrong {
          public static void main(String[] args) {
                    int n = 152;
                    armstrongFun(n);
          }

          private static void armstrongFun(int n) {
                    int temp = n;
                    int n1 = n;
                    int c = 0;
                    while(n1 > 0){
                              c++;
                              n1/=10;
                    }
                    int sumDigit = 0;
                    while(n > 0){
                              int r = n%10;
                              sumDigit += Math.pow(r,c);
                              n/=10;
                    }
                    if(sumDigit == temp) System.out.println("Armstrong Number");

                    else System.out.println("Not an armstrong number");
          }
}
