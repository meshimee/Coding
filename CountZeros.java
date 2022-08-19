public class CountZeros {
          public static void main(String[] args) {
                    //int[][] grid = {{0,0,0,1,1},{0,0,0,1,1},{0,0,1,1,1},{0,1,1,1,1},{0,1,1,1,1}};
                    //int count = countZeros(grid);
                   // System.out.println(count);
                   int[][] grid = {{1,5,9},{10,11,13},{12,13,15}};
                   int k = 8;
                   kthSmallest(grid,k);
          }
          private static int countZeros(int[][] grid) {
                    int n = grid.length;
                    int i = 0;
                    int j = n - 1;
                    int count = 0;
                    while(i < n && j >= 0){
                              if(grid[i][j] == 1)
                                        j--;
                              else{
                                        count += (j+1);
                                        i++;
                              }                 
                    }
                    return count;
          }
          public static void kthSmallest(int[][] matrix, int k) {
                    int n = matrix.length;
                    int[] arr = new int[n*n];
                    int m = 0;
                    for(int i = 0; i < matrix.length ; i++){
                        for(int j = 0 ; j < matrix[0].length ; j++){
                            arr[m] = matrix[i][j];
                            m++;
                        }
                    }
                    for(int i = 0; i<arr.length ; i++){
                              System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                }
}


