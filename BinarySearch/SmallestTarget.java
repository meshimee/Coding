//Given a characters array letters that is sorted in 
//non-decreasing order and a character target, return the smallest 
//character in the array that is larger than target.

package BinarySearch;

public class SmallestTarget {
          public static void main(String[] args) {
                    char[] arr = {'c','f','j'};
                    char target = 'c';
                    char ch = nextGreatestLetter(arr,target);
                    System.out.println(ch);

          }
          public static char nextGreatestLetter(char[] letters, char target) {
                    char res = letters[0];
                    int low = 0;
                    int high = letters.length-1;
                    while(low <= high){
                              int mid = low + (high-low/2);
                              if(letters[mid] < target) {
                                        low = mid + 1;
                              }
                              else if(letters[mid] == target){
                                        low = mid + 1;
                              }
                              else{
                                        res = letters[mid];
                                        high = mid - 1;
                            }
                    }
                    return res;
                }
}
