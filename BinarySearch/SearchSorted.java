package BinarySearch;
public class SearchSorted {
          public static void main(String[] args) {
                    //int[] nums = {1,3,4,2};
                    //boolean ans = containsDuplicate(nums);
                    //System.out.println(ans);
                    int[] nums = {2,5,9,6,9,3,8,9,7,1};
                    int n = findDuplicate(nums);
                    System.out.println(n);       
          }
         
          private static int findDuplicate(int[] arr) {
          int n = arr.length;
          int freq[] = new int[n + 1];
          for (int i = 0; i < n; i++) {
            if (freq[arr[i]] == 0) {
                freq[arr[i]] += 1;
            } else {
                return arr[i];
            }
        }
        for(int i = 0 ; i<freq.length ; i++){
          System.out.print(freq[i]+" ");
        }
        return 0;
          }
}

