package Array.Sorting;

public class SelectionSort {
          public static void main(String[] args) {
                    int[] arr = {65,45,3,4,67,77,5,1};
                    //45,65,3,4,67,77,5,1
                    //3,65,45,
                    selection_Sort(arr);

          }
          private static void selection_Sort(int[]arr){
                    for(int i = 0; i < arr.length-1 ; i++){
                              for(int j = i+1 ; j<arr.length ; j++){
                                        if(arr[i] > arr[j]){
                                                  int tmp = arr[i];
                                                  arr[i] = arr[j];
                                                  arr[j] = tmp;
                                        }
                              }
                    }
                    System.out.println("After bubble sort: ");
                    for (int i = 0; i < arr.length; i++) {
                      System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                  }
          }

