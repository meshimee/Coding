import java.util.HashMap;

public class IntersectionArray {
          public static void main(String[] args) {
                    int[] n1 = {1,2,2,1};
                    int n = n1.length-1;
                    int[] n2 = {1,2};
                    int m = n2.length-1;

                    int len = (n>m ? n : m);
                    int[] arr = new int[len];
                    HashMap<Integer,Integer> h1 = new HashMap<>();
                    HashMap<Integer,Integer> h2 = new HashMap<>();

                    for(int i = 0; i < n ; i++){
                              h1.put(n1[i],i);
                    }
                    for(int i = 0; i < m ; i++){
                              h2.put(n2[i],i);
                    }
                    
          }
}
