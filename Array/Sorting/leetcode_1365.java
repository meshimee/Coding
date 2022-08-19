package Array.Sorting;
public class leetcode_1365 {
          public static void main(String[] args) {
                    int[] arr = {7,7,7,7,7};
                    int[] res = new int[arr.length];
          
                     res= smallerNumbersThanCurrent(arr);

                     for(int i = 0; i<arr.length ; i++){
                              System.out.print(res[i]+" ");
                     }
                     System.out.println();
          }
          private static int[] smallerNumbersThanCurrent(int[] arr){
                    int[] ans = new int[arr.length];

                    for(int i = 0; i<arr.length ; i++){
                              int temp = 0;
                              for(int j = 0 ; j <arr.length ; j++){
                                        if(arr[i] > arr[j])
                                        temp++;
                              }
                              ans[i] = temp;
                    }
                    return ans;

          }
}
