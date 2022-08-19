class MatCount{
          public static void main(String[] args) {
                    int[][] grid = {{4,3,2,1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
                    int ans = count(grid);
                    System.out.println(ans);
          }

          private static int count(int[][] grid) {
                    int m = grid.length;
                    int n = grid[0].length;
                    int i = 0;
                    int j = n-1;
                    int count = 0;
                    while(i < m && j >= 0){
                        if(grid[i][j] < 0){
                            count += m - i;
                            j--;
                        }
                        else 
                            i++;
                    }
                    return count;
            }
}