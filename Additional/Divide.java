import java.util.Stack;

public class Divide {
          public static int helper_fun(int a){
                    if(a < 10) return a+10;
                    Stack<Integer> st = new Stack<>();

                    for(int i = 9; i>= 2 ; i--){
                              while(a % i == 0){
                                        st.push(i);
                                        a = a/i;
                              }
                    }
                    if( a == -1)
                    return -1;

                    int b = 0;
                    while(!st.isEmpty()){
                              int x = st.peek();
                              st.pop();
                              b = b * 10 + x;
                    }
                    return b;
          }
          public static void main(String[] args) {
                    int a = 10;
                    int ans =helper_fun(a);
                    System.out.println(ans);
          }
}
