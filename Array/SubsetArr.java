package Array;
import java.util.HashMap;

public class SubsetArr {
          public static void main(String[] args) {
                    int[] arr1 = {1,3,4,5,2};
                    int[] arr2 = {11,12,13,15,16};
                    int n = arr1.length;
                    int m = arr2.length;
                    //boolean flag = isSubset(arr1,arr2,n,m);
                    //boolean flag = Binary_Search(arr1,arr2,n,m);
                    boolean flag = hashing(arr1,arr2, n , m);
                    if(flag)
                    System.out.println("arr1[] is a subset of arr2[]");

                    else
                    System.out.println("arr1[] is not a subset of arr2[]");
          }
          
          //USING TWO FOR LOOPS

          // private static boolean isSubset(int[] arr1, int[] arr2, int n, int m) {
          //           if(n > m) return false;
                    
          //           for(int i = 0 ; i<n ; i++){
          //                     boolean present = false;
          //                     for(int j = 0 ; j<m ; j++){
          //                               if(arr1[i] == arr2[j]){
          //                                         present = true;
          //                                         break;
          //                               }
          //                     }
          //                     if(present == false) return false;
          //           }
          //           return true;
          // }

          //USING BINARY SEARCH AND SORTING

          // private static boolean Binary_Search(int[] arr1, int[] arr2, int n, int m) {
          //           if(n > m) return false;
          //           Arrays.sort(arr2);
          //           for(int i = 0; i<n ; i++){
          //                    boolean present = isPresent(arr2, arr1[i], m);
          //                    if(present == false) return false;
          //           }
          //           return true;
          // }
          // private static boolean isPresent(int[] arr2, int s, int e) {
          //           int start = 0;
          //           int end = e;
          //           while(start < end){
          //                     int mid = (start + end)/2;
          //                     if(arr2[mid] == s)
          //                     return true;

          //                     else if(arr2[mid] > s)
          //                     end = mid;

          //                     else 
          //                     start = mid;
          //           }
          //           return false;
          // }

          //USING HASHING

          private static boolean hashing(int[] arr1, int[] arr2, int n, int m) {
                    if(n > m ) return false;
                    HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();
                    for(int i = 0 ; i < arr2.length ; i++){
                              hm.put(arr2[i],true);
                    }
                    for(int j = 0 ; j < arr1.length ; j++){
                              if(hm.containsKey(arr1[j])==false){
                                        return false;
                              }
                    }
                    return true;
           }
}