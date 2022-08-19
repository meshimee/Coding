public class Intrest {
          public static void main(String[] args) {
                    int n = 4;
                    int percentage = 2000;
                    int m = 50;
                    int i = 0;
                    while( i < n-1){
                              m = (percentage*m)/100;
                              i++;
                    }
                    System.out.println(m);
          }
}
