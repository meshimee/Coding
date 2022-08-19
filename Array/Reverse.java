package Array;

public class Reverse {
          public static void main(String[] args) {
                    int[] arr = {4,5,6,7,8,9,10};
                    reverse(arr);
          }

          // private static void reverse(int[] arr) {
          //           for(int i = arr.length-1 ; i >= 0 ; i--){
          //                     System.out.print(arr[i]+" ");
          //           }
          //           System.out.println();
          // }

          private static void reverse(int[] arr) {
                    int n = arr.length;
                    int s = 0;
                    int e = n-1;
                    while(s < e){
                              int tmp = arr[s];
                              arr[s] = arr[e];
                              arr[e] = tmp;
                              s++;
                              e--;
                    }
                    for(int j = 0; j<n ; j++){
                              System.out.print(arr[j]+" ");
                    }
                    System.out.println();
          }
}
