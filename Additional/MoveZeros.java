public class MoveZeros {
     public static void main(String[] args) {
               int[] arr = {1,2,0,0,3,4};

               for(int i = 0; i<arr.length-1 ; i++){
                         for(int j = i+1 ; j<arr.length-1 ; j++){
                                   if(arr[j] == 0){
                                             int tmp = arr[j];
                                             arr[j] = arr[j+1];
                                             arr[j+1] = tmp;
                                   }
                         }
               }
               for(int i = 0; i<arr.length ; i++){
                         System.out.println(arr[i]);
               }
     }     
}
