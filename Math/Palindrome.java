class Palindrome{
          public static void main(String[] args) {
                    // int n = 1212;
                    // boolean ans = check(n);
                    // if(ans) System.out.println(n+" is palindrome");

                    // else
                    // System.out.println(n+" is not palindrome");
                    int a = 100;
                    int b = 150;

                    palindromeRange(a,b);
          }
          private static void palindromeRange(int a, int b) {
                    for(int i = a ; i < b ; i++){
                              if(check(i))
                              System.out.println(i);

                    }
          }


          private static boolean check(int n) {
                    int temp = n;
                    int y = 0;
                    while(n != 0){
                              int r = n%10;
                              y = y * 10 + r;
                              n /= 10;
                    }
                    if(y == temp) return true;

                    return false;
          }
}