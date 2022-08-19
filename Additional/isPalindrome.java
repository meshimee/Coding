// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.

class isPalindrome {
          public static boolean check(String str){
                    if(str == null)
                    return false;


                    int s = 0;
                    int e = str.length()-1;

                    while(s<e){
                              if(!isAlpha(str.charAt(s))){
                                        s++;
                              }
                              else if(!isAlpha(str.charAt(e))){
                                        e--;
                              }
                              else if(lowerCase(str.charAt(s)) != lowerCase(str.charAt(e))){
                                        return false;
                              }
                              else{
                                        s++;
                                        e--;
                              }
                    }
                    return true;
          }
          private static boolean isAlpha(char c){
                    return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9');
          }
          private static char lowerCase(char c){
                    if('a' <= c && c <= 'z' || ('0' <= c && c <= '9')) return c;

                    return (char)((int)c+32);
          }

          public static void main(String args[]) {
              String str = "A man, a plan, a canal: Panama";
              String s = "race a car";
              boolean ans = check(str);
                    if(ans)
                    System.out.println("True");
              
                   else
                   System.out.println("False");
          }
      }