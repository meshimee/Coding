import java.util.Arrays;

public class Mat {
          public static void main(String[] args) {
                    int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
                    int k = 3;
                    int[] ans = kWeakestRows(mat,k);
                    Arrays.sort(ans);                       
                    for(int i = 0; i < k ; i++){            
                              System.out.print(ans[i]+" "); 
                    }
          }
          private static int[] kWeakestRows(int[][] mat, int k) {
                    int[] ans = new int[mat.length];
                    int ki = 0;
                    for(int i = 0; i<mat.length ; i++){
                              for(int j = 0; j<mat[0].length ; j++){
                                        ans[ki] += mat[i][j];
                                        
                              }
                              ki++;
                    }
                    return ans;
          }
}
