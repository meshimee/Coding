//Change case of each character in a string
package String;

public class ChangeCase {
          public static void main(String[] args) {
                    String str = "take u forward IS Awesome"; //TAKE U FORWARD is aWESOME
                    changeCase(str);
                    
          }
          private static void changeCase(String str) {
                    StringBuilder sb = new StringBuilder();
                    for(int i = 0; i<str.length() ; i++){
                              int ascii = (int) str.charAt(i);
                              if(ascii >= 65 && ascii <= 90){
                                        sb.append((char) (ascii + 32));
                              }
                              else if(ascii >= 97 && ascii <= 122)
                                        sb.append((char) (ascii - 32));
                              else if(str.charAt(i)== ' ')
                                        sb.append(' ');
                    }
                    System.out.println(sb);
          }
 }
          
