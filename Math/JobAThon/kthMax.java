package JobAThon;

public class kthMax {
          public static void main(String[] args) {
                    int[] arr = {3,0,1};
                    //int n = arr.length;
                    // int k = 3;
                    // kthmax(arr,n,k);
                    int n = missingNumber(arr);
                    System.out.println(n);
          }

          // private static void kthmax(int[] arr, int n, int k) {
                    // HashSet<Integer> hm = new HashSet<>();
                    // for(int i = 0 ; i<n ; i++){
                    //      hm[arr[i]]++;     
                    // }
                    public static int missingNumber(int[] nums) {
                              int n = nums.length;
                              int sum = (n*(n+1))/2;
                              int sn = 0;
                              for(int i = 0 ; i < n ; i++){
                                        sn += nums[i];
                              }
                              return sum-sn;  
                          }
                         
          }


