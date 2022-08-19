package String;

public class Count_VCS {
          public static void main(String[] args) {
                    String str = "Take u forward is Awesome";
                    count(str);
                }
          private static void count(String str) {
          int vowel = 0, consonent = 0, whitespace = 0;
          str = str.toLowerCase();
          for(int i = 0; i < str.length()-1 ; i++){
                    char ch = str.charAt(i);
                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                              vowel++;
                    }
                    else if(ch >= 'a' && ch <= 'z'){
                              consonent++;
                    }
                    else if(ch == ' ')
                    whitespace++;
                     }
                     System.out.println("Numbers of vowels are "+vowel);
                     System.out.println("Numbers of consonents are "+consonent);
                     System.out.println("Numbers of whitespaces are "+ whitespace);

          }
}
