package String;

import java.util.Stack;

public class ReverseWord {
          public static void main(String[] args) {
                   String s = "this is an amazing program";
                   System.out.println(s);
                   reverseWord(s);
          }

          private static void reverseWord(String s) {
                    s += " ";
                    Stack<String> st = new Stack<>();
                    String str = "";
                    for(int i = 0; i<s.length() ; i++){
                              if(s.charAt(i) == ' '){
                                        st.push(str);
                                        str = "";
                              }
                              else{
                                        str += s.charAt(i);
                              }
                    }
                    String ans = "";
                    while(st.size() != 1){
                              ans += st.peek()+" ";
                              st.pop();
                    }
                    ans += st.peek();  
                    System.out.println(ans);    
          }
}
