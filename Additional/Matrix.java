public class Matrix {
          public static void main(String[] args) {
                    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
                    transpose(matrix);
                    
                    for(int i = 0; i<matrix.length ; i++){
                              for(int j = 0 ; j<matrix.length ; j++){
                                        System.out.print(matrix[i][j]+" ");
                              }
                              System.out.println();
                    }
          }

          private static void transpose(int[][] matrix) {
                    for(int i = 0; i < matrix.length ; i++){
                              for(int j = i ; j<matrix.length ; j++){
                                       swap(matrix, matrix[i][j],matrix[j][i]);
                              }
                    }
                    
          }

          private static void swap(int[][] matrix, int i, int j) {
                    int tmp = i;
                    i = j;
                    j = tmp;
          }
}

