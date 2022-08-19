package Array;
public class ScSmall {
          public static void main(String[] args) {
                    int[] arr = {0,1,4,7,7,5,8};
                    System.out.println("Second smallest element in the array is : "+sec_smallest(arr));
                    
                    //1,2,4,5,7,7,8
                    //small = 1
                    
          }

          private static int  sec_smallest(int[] arr) {
                    int small = 999999;
                    int s_small = 999999;

                    for(int i = 0; i < arr.length ; i++){
                              if(arr[i] < small){
                                        s_small = small;
                                        small = arr[i];
                              }
                              else if(arr[i] < s_small && arr[i] != small){
                                        s_small = arr[i];
                              }
                    }
                    return s_small;
          }
}

          // private static void sec_smallest(int[] arr) {
          //           int n = arr.length;
          //           if(n == 0 || n == 1){
          //                     System.out.println("-1");
          //                     System.out.println();
          //                     System.out.println("-1");
          //                     System.out.println();
          //           }
          //           int small = Integer.MAX_VALUE;
	//           int s_small = Integer.MAX_VALUE;
	//           int large = Integer.MIN_VALUE;
	//           int s_large = Integer.MIN_VALUE;
          
          //           for(int i = 0 ; i < arr.length ; i++){
          //                     small = Math.min(small,arr[i]);
          //                     large = Math.max(large,arr[i]);
          //           }
          //           for(int i = 0; i < n ; i++){
          //                     if(s_small > arr[i] && small != arr[i] )
          //                     s_small = arr[i];

          //                     if(s_large < arr[i] && large != arr[i])
          //                     s_large = arr[i];
          //           }
          //           System.out.println("Second largest element is "+s_large);
          //           System.out.println("Second smallest element is "+s_small);
          //           }
          // }
