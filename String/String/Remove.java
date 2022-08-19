//Remove characters from a string except alphabets
package String;

public class Remove {
          public static void main(String[] args) {
                    String str = "take12% *&u ^$#forward";
                    remove_characters(str);
          }

          private static void remove_characters(String str) {
                    int n = str.length();
                    StringBuffer sb = new StringBuffer();
                    for(int i = 0; i<n ; i++){
                              char ch = str.charAt(i);
                              if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
                                        sb.append(ch);
                              }
                    }
                    System.out.println(sb);
          }
          
}
