class Solution {

    public static int removeElement(int[] nums, int val) {

        if(nums.length == 0) return 0;
        int j = 0;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i] != val ){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
class Main{
          public static void main(String args[]){
                    int[] arr = {3,2,2,3};
                    int num = 3;
                    System.out.println(removeElement(arr,num));
          }

        private static char[] removeElement(int[] arr, int num) {
            return null;
        }

}