public class ToggleCase {
          public static void main(String[] args) {
                    String s = "pepCODing";               //PEPcodING

                    toggleCase(s);
                    //System.out.println(s);
          }

          private static void toggleCase(String s) {
                    StringBuilder sb = new StringBuilder();

                    for(int i = 0; i < s.length() ; i++){
                              char ch = s.charAt(i);

                              if(ch >= 'a' && ch <= 'z'){
                                        ch = (char) ('A'+ch-'a');     //small to capital
                                        sb.append(ch);
                              }
                              
                              else{
                                        ch = (char) ('a'+ch-'A');               //small to large
                                        sb.append(ch);
                              }
                              
                    }
                    System.out.println(sb);
          }
}
