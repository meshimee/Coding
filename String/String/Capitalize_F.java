package String;

//NOTE
// (int) str[i] gives the ASCII value of the ith string character 
// ((int) str[i] – 32) gives the ASCII value of the Capitalized ith string character 
// (char)((int) str[i] – 32) converts the ASCII value to its corresponding character
// In Java , the StringBuffer class is used to create mutable (modifiable) strings.


public class Capitalize_F {
          public static void main(String[] args) {
             String str = "take u forward is awesome"; //TakE U ForwarD IS AwesomE
             int size = str.length();
             Capitalize_fun(str, size);
          }

          private static void Capitalize_fun(String str, int n) {
            StringBuffer sb = new StringBuffer(str);

            for(int i = 0; i < n ; i++){

                if(i == 0 || i == n-1 && (int)str.charAt(i) >= 97){
                    sb.setCharAt(i, (char)((int) str.charAt(i) - 32));
                }
                else if(str.charAt(i) == ' '){
                    if(((int)str.charAt(i-1)-32) >= 65)
                       sb.setCharAt(i-1, (char)((int) str.charAt(i-1) - 32));
                
                    if(((int)str.charAt(i+1)-32) >= 65)
                       sb.setCharAt(i+1, (char)((int) str.charAt(i+1) - 32));
                }
            }
            System.out.println(sb);
          }
}
