package Array.Sorting;
import java.util.Arrays;

class Leetcode_2160{
          public static void main(String[] args) {
                    int n = 4009;
                    int[] arr = new int[4];
                    int n1 = arr.length-1;
                    for(int i = 0 ; i < arr.length ; i++){
                              int d = n%10;
                              if(d != 0){
                              arr[n1] = d;
                              }
                              n = n/10;
                              n1--;
                    }
                    Arrays.sort(arr);
                    int num1 = arr[0]*10+arr[2];
                    int num2 = arr[1]*10+arr[3];

                    System.out.println(num1+num2);
          }
}