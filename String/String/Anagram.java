package String;
public class Anagram {
          public static void main(String[] args) {
                    String s1 = "anagram";
                    String s2 = "nagaram";
                    boolean ans = isAnagram(s1,s2);
                    System.out.println(ans);
          }
          private static boolean isAnagram(String s1, String s2) {
                    char[] a1 = new char[26];
                    char[] a2 = new char[26];
                    
                    for(int i = 0; i < s1.length() ; i++){
                              a1[i - 'a']++;
                    }
                    for(int i = 0; i < s2.length() ; i++){
                              a2[i - 'a']++;
                    }
                    for(int i = 0; i<26 ; i++){
                              if(a1[i] != a2[i])
                              return false;
                    }
                    return true;
          }
}
