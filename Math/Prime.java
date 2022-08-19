public class Prime {
         
          public static boolean isPrime(int num) {
                    if (num == 1)
                    return false;

                    int count = 0;
                    for (int i = 2; i <num; i++) {
                      if (num % i == 0){
                        count++;
                        break;
                      }
                    }
                    if(count == 0) return true;

                    else
                    return false;
                  }
                  public static void PrintPrimesbwrange(int a, int b) {
                    for (int i = a; i <= b; i++) {
                      if (isPrime(i)== true) {
                        System.out.print(i + " ");
                      }
                    }
                  }
                  public static void main(String args[]) {
                    int a = 2, b = 10;
                    PrintPrimesbwrange(a, b);
                  }
                }

