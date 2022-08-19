package String;

public class Palindrome {
          public static void main(String[] args) {
                    String s = "TAKE U FORWARD";
                    boolean ans = reverse(s);
                    if(ans == true)
                    System.out.println("Yes the given string is Palindrome");

                    else
                    System.out.println("Yes the given string is not palindrome");
                   
          }

          private static boolean reverse(String str) {
            int left = 0, right = str.length()-1;
            char l = str.charAt(left), r = str.charAt(right);
            if(!Character.isLetterOrDigit(l)) 
                left++;
            else if(!Character.isLetterOrDigit(r)) 
                right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)) 
                return false;
            else {
                left++; 
                right--;
            }
                    // int s = 0;
                    // int end = str.length()-1;
                    // boolean flag = true;
                    // while(s < end){
                    //           if(str.charAt(s) != str.charAt(end)){
                    //                     flag = false;
                    //                     break;
                    //           }
                    //           s++;
                    //           end--;
                    // }
                    //if(flag == true) return true;

                    return true;
          }
}
