public class RunningSum {
         public static void main(String[] args) {
                   int[] nums = {1,2,3,4};
                 
          for(int i = 1; i<nums.length ; i++){
                    nums[i] += nums[i-1];
                    //nums[] = {1,3,6,10}
                } 
          //        return nums;
          for(int i = 0; i<nums.length; i++){
                    System.out.println(nums[i]);
          }
         } 
}
