class Diagonal{
          public static void main(String[] args) {
                    int[][] matrix = {{1,2,3},{4,5,6},{9,8,9}};
                    int n = matrix.length;
                    int i = 0;
                    int j = 0;
                    int suml = 0;
                    int sumr = 0;

                    while(i != n && j != n){
                              suml += matrix[i][j];
                              i++;
                              j++;
                    }
                    System.out.println(suml);
                     i = 0;
                     j = n-1;
                     while(i != n && j >= 0){
                              sumr += matrix[i][j];
                              i++;
                              j--;
                     }
                     System.out.println(sumr);
                     System.out.println(Math.abs(suml - sumr));
          }
}