public class ArrayPermutation {
          public static void main(String args[]){
                    int[] nums = {0,2,1,5,3,4};
                    int[] ans = new int[nums.length];
                    for(int i = 0; i<ans.length ; i++){
                              ans[i] = nums[nums[i]];
                    }
                    
                    int n = nums.length;
                    for(int i = 0; i<n ; i++){
                              nums[i] = n * (nums[nums[i]]%n) + nums[i];
                    }
                   
                    for(int i = 0; i<n ; i++){
                              nums[i] = nums[i]/n;
                    }

                    for(int i = 0; i<nums.length ; i++){
                               System.out.print(nums[i]+" ");
                    }
                    
          }         
}
