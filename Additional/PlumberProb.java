import java.util.Scanner;

public class PlumberProb {
          public static void main(String[] args) {
                    Scanner sb = new Scanner(System.in);
                    int n1[] = new int[5];
                    int n2[] = new int[6];
                    int r = 1;

                    int sum1 = 0;
                    int sum2 = 0;

                    System.out.println("Enter the incomming input");
                    for(int i = 0; i<n1.length ; i++){
                               n1[i] = sb.nextInt();
                    }
                    System.out.println("Enter the outgoing output");
                    for(int i = 0; i<n2.length ; i++){
                              n2[i] = sb.nextInt();
                   }
                   for(int i = 0; i<n1.length ; i++){
                    sum1 += n1[i]-r;
                    }
                    for(int i = 0; i<n2.length ; i++){
                              sum2 += n2[i]-r;
                              
                    }
                    if(sum1 == sum2) 
                    System.out.println("BALANCED");

                    if(sum1 > sum2){
                              int n = sum1-sum2+r;
                              System.out.println(n*-1);
                    }
                    if(sum1 < sum2){
                              int n = sum2-sum1+r;
                              System.out.println(n);
                    }
                    sb.close();

          }
}
