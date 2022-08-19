package BinarySearch;

public class GuessNum {
          public static void main(String[] args) {
                    String str = "aabceffgh";
                    occurence(str);
                    
          }

          private static void occurence(String str) {
                   for(int i = 8; i>=0 ; i--){
                    for(int j= 0; j <= i ; j++){
                              System.out.print("*");
                    }
                    System.out.println();
                   }
                   for(int i = 3 ; i <= 6 ; i++){
                    for(int j = 0 ; j<i ; j++){
                              System.out.print("*");
                    }
                    System.out.println();
                   }

          }
}
