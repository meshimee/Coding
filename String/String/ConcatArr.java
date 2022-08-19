package String;

// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Input: nums = [1,3,2,1]
// Output: [1,3,2,1,1,3,2,1]

public class ConcatArr {
          public static void main(String[] args) {
                    int[] nums = {1,2,1};
                    int n = nums.length;
                    int[] ans = new int[nums.length * 2];

                    for(int i = 0; i<n ; i++){
                              ans[i] = nums[i];
                              ans[i+n] = nums[i];
                              //ans[] = {1,2,1,1,2,1}
                    }
                    for(int i = 0; i<2*n ; i++){
                              System.out.print(ans[i]+" ");
                    }
          }
}
