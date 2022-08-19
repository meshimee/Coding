package String;
import java.util.Stack;

public class ReverseString {
          public static void main(String[] args) {
                    String str = "I AM IRON MAN";
                    //reverse(str);
                    reverseUsingStack(str);
              
          }

          // private static void reverse(String str) {
          //           int i = 0;
          //           int j = str.length()-1;

          //           while(i < j){
          //            str = swap(str,i,j);
          //            i++;
          //            j--;
          //           }
          //           System.out.println(str);
          // }

          // private static String swap(String s,int i, int j) {
          //           StringBuilder sb = new StringBuilder(s);
          //           sb.setCharAt(i, s.charAt(j));
          //           sb.setCharAt(j, s.charAt(i));
          //           return sb.toString();
          // }
          
          private static void reverseUsingStack(String str) {
                    Stack<Character> st = new Stack<>();
                    char[] s = new char[str.length()];
                    for(int i = 0; i < str.length() ; i++){
                              char ch = str.charAt(i);
                              st.push(ch);
                    }
                    int i = 0;
                    while(!st.isEmpty()){
                              s[i++] = st.pop();
                    }
                    str = new String(s);
                    System.out.println(str);
                    }
          }

          

