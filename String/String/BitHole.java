package String;
public class BitHole {
          public static void main(String[] args) {
                    String str = "10111,10101,11101,11111";
                    int n = BitmapHoles(str); 
                    System.out.println(n);
          }

          private static int BitmapHoles(String str) {

            String[] numbers = str.split(",");

            int size = (int) Math.sqrt(numbers.length);
            System.out.println(size);
            String[][] bitmap = new String[size][size];
            int count = 2;
            for(int i = 0; i<size ; i++){
              for(int j = 0; j <size ; j++){
                System.out.print(bitmap[i][j]+" ");
              }
            }
          //   for (int i = 0; i < bitmap.length; i++) {
          //      for (int j = 0; j < bitmap[i].length; j++) {
          //         if (bitmap[i][j] == "0") {
          //             coverHole(bitmap, i, j, count++);
          //         }
          //       }
          // }
          return count - 2;
        }
          // private static void coverHole(String[][] bitmap, int i, int j, int k) {
          //   bitmap[i][j] = k;
          //   if (bitmap[i][j - 1] == 0) {
          //     bitmap[i][j - 1] = k;
          //     coverHole(bitmap, i, j - 1, k);
          //   }
          //   if (bitmap[i][j + 1] == 0) {
          //     bitmap[i][j + 1] = k;
          //     coverHole(bitmap, i, j + 1, k);
          //   }
          //   if (bitmap[i - 1] !== undefined && +bitmap[i - 1][j] == 0) {
          //     bitmap[i - 1][j] = k;
          //     coverHole(bitmap, i - 1, j, number);
          //   }
          //   if (bitmap[i + 1] !== undefined && +bitmap[i + 1][j] == 0) {
          //     bitmap[i + 1][j] = k;
          //     coverHole(bitmap, i + 1, j,k);
          //   }
          //   return;
          // }
      
           
        }

