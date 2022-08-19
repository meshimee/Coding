package Array.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_2089 {
          public static void main(String[] args) {
                    int[] arr = {1,2,5,2,3};
                    List<Integer> li = new ArrayList<Integer>();
                    
                    int target = 5;
                    Arrays.sort(arr);

                    for(int i = 0 ; i<arr.length ; i++){
                              if(arr[i] == target){
                                        li.add(i);
                              }
                    }
                    for(int i : li){
                              System.out.print(i+" ");
                    }

                    
          }
}
