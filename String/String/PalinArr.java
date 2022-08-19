package String;
// Input: arr[] = {121, 131, 20} 
// Output: Array is not a PalinArray 
// For the given array, element 20 is not a palindrome. Thus the array is not a PalinArray.
// Input: arr[] = {111, 121, 222, 333, 444} 
// Output: Array is a PalinArray 
// For the given array, all the elements of the array are palindromes. Thus the array is a PalinArray. 

class PalinArr{
          static boolean check(int arr[]){
                    for(int i = 0; i<arr.length ; i++){
                    int ans = 0;
                    int tmp = arr[i];

                    while(tmp != 0){
                              int r = tmp%10;
                              ans = ans * 10 + r;
                              tmp /= 10;
                    }
                    if(ans != arr[i])
                    return false;
                    }

                    return true;
          }

          public static void main(String args[]){
                    //int arr[] = {121,131,20};
                    //int arr1[] = {111,121,222,333,444};
                    int arr2[] = {525,606,7571};
                    // if(check(arr))
                    // System.out.println("Array is a PalinArray");
                    // else
                    // System.out.println("Array is not a PalinArray");

                    if(check(arr2))
                    System.out.println("Array is a PalinArray");
                    else
                    System.out.println("Array is not a PalinArray");
          
          }
}