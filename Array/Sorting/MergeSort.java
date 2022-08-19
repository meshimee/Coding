package Array.Sorting;

public class MergeSort {
          public static void main(String[] args) {
                    
                    int[] arr = {3,2,8,5,1,4,23};
                    for(int i = 0 ; i < arr.length ; i++){
                              System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                    int s = 0;
                    int e = arr.length-1;
                    merge_Sort(arr, s, e);

                    for(int i = 0 ; i < arr.length ; i++){
                              System.out.print(arr[i]+" ");
                    }
                    System.out.println();
          }

          private static void merge_Sort(int[]arr, int s, int e){
                    if(s < e){
                              int mid = (s+e)/2;
                              merge_Sort(arr,s,mid);
                              merge_Sort(arr,mid+1,s);
                              merge(arr,s,mid,e);
                    }
          }

          private static void merge(int[] arr, int l, int mid , int r){
                    int[] temp = new int[1000];
                    int i = l , j = mid+1, f = l;
                    
                    while( i<= mid && j <= r){
                              if(arr[i] < arr[j]){
                                        temp[f] = arr[i];
                                        i++;
                              }
                              else{
                                        temp[f] = arr[j];
                                        j++;
                              }
                              f++;
                    }
                    if( i > mid){
                              while(j <= r){
                                        temp[f] = arr[j];
                                        f++;
                                        j++;
                              }
                    }else{
                              while(i <= mid){
                                        temp[f] = arr[i];
                                        f++;
                                        i++;
                              }
                    }
                    for (f = l; f <= r; f++) {
                              arr[f] = temp[f];
                       }
          }
}
