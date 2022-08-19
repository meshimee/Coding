package BinarySearch;

public class SeachInterst {
          public static void main(String[] args) {
               String[] s = {"--X","X++","X++"};  
               int k = 0;
               for(int i = 0; i < s.length ; i++){
                    if(s[i].charAt(1) == '-'){
                              k--;
                    }
                    else if(s[i].charAt(1) == '+')
                             k++;
               }
               System.out.println(k);
          }
}
