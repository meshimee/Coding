package Array.Sorting;

public class BubbleSort {
          public static void main(String[] args) {
                    int arr[] = {13,46,24,52,20,9};
                    //13,46,24,52,20,9
                    //13,46,24,52,20,9
                    //13,24,46,52,20,9
                    //13,24,46,52,20,9
                    //13,24,46,20,52,9
                    //13,24,46,20,9,52
                    bubbleSort(arr);
          }

          private static void bubbleSort(int[] arr) {
                    for(int i = 0; i<arr.length ; i++){
                              for(int j = 0 ; j<arr.length-1 ; j++){
                                        if(arr[j] > arr[j+1]){
                                                  int tmp = arr[j];
                                                  arr[j] = arr[j+1];
                                                  arr[j+1] = tmp;
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

