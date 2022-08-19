package String;

public class PerformingOP {
      public static void main(String[] args) {
            String[] operations = {"--X","X++","X++"};
            int ans = finalValueAfterOperations(operations);
            System.out.println(ans);
         }

      public static int finalValueAfterOperations(String[] op) {
               int ans = 0;
               for(int i = 0; i<op.length ; i++){
                  if(op[i].charAt(1) == '+')
                  ans += 1;
                  else
                  ans -= 1;
                  }
                  return ans;
            }
          
}
