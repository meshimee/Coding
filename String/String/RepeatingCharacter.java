package String;

import java.util.HashMap;

public class RepeatingCharacter {
          public static void main(String[] args) {
                    String s = "leetcode";
                    char ch = repeatedCharacter(s);
                    System.out.println(ch);
          }

          private static char repeatedCharacter(String s) {
                    HashMap<Character,Integer> mp = new HashMap<>();
                    for(int i = 0 ; i < s.length() ; i++){
                              if(mp.containsKey(s.charAt(i))) return s.charAt(i);
                              else 
                              mp.put(s.charAt(i),1);
                    }
                    return 'a';
          }
}
