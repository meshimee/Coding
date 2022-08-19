package String;
public class RemoveBracket {
          public static void main(String[] args) {
                    String str = "a+((b-c)+d)";  //“a+b-c+d”
                    removeBracket(str);
          }
          private static void removeBracket(String str) {
                      StringBuilder sb = new StringBuilder();
                        for(int i = 0 ; i<str.length() ; i++){
                              char ch = str.charAt(i);
                              if( ch != ')' && ch != '('){
                                        sb.append(ch);
                              }
                        }
                   
                   System.out.println(sb);
          
          }
}
