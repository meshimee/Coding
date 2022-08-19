import java.util.Arrays;
import java.util.HashSet;

public class EvenOdd {
          public static void main(String[] args) {
                    // int n = 61;
                    // if((n & 1) == 1) System.out.println("Odd");
                    // else System.out.println("even");
                    // int n = 5;

                    // if(n >> 31 == 0) System.out.println("Positive");

                    // else System.out.println("negative");
                    int[] arr = {-12, 17, -13, 17 };
                    int n = arr.length;
                    maximumMultiple(n, arr);
          }
           
                    public static void maximumMultiple(int n, int[] arr) {
                              int[] b = new int[n/2];
                              int m = b.length-1;
                              for(int i = 0; i < n ; i+=2){
                                  b[m] = (arr[i] * arr[i+1]);
                                  m--; 
                              }
                              for(int i = 0; i < b.length ; i++){
                                        System.out.println(b[i]);
                              }
                              int mi = -99999;
                              for(int i = 0; i < b.length ; i++){
                                        if(b[i] > mi)
                                        mi = b[i];
                              }
                              System.out.println(mi);
                          }
}
