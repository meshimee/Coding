package Array;
public class SmallestEle {
          public static void main(String[] args) {
                    int arr[] = {8,10,5,7,9,0,90};
                    //System.out.println("The smallest element in the array is "+ small(arr));
                    //System.out.println("The smallest element in the array is "+ fun(arr));
                    System.out.println("The largest element in the array is "+ max_val(arr));
          }
          //nlogn
          // private static int small(int[] arr) {
          //           Arrays.sort(arr);
          //           return arr[0];
          // }

          private static int max_val(int[] arr) {
                    int mx = arr[0];
                    for(int i = 1; i < arr.length ; i++){
                              if(mx < arr[i]){
                                        mx = arr[i];
                              }
                    }
                    return mx;
          }

          // private static int fun(int[] arr) {
          //           int min = arr[0];
          //           for(int i = 1 ; i < arr.length ; i++){
          //                     if(arr[i] < min){
          //                               min = arr[i];
          //                     }
          //           }
          //           return min;
          // }

}
