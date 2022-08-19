package String;
public class RemvSpaces {
          public static void main(String[] args) {
                    String str ="Take you forward"; 
                    //char[] str = "Take you forward".toCharArray();
                    remove_space(str);
          }
          private static void remove_space(String str) {
                    char[] character = str.toCharArray();
                    String s = " ";
                    for(int i = 0 ; i < character.length ; i++){
                              if(character[i] != ' '){
                                        s = s + character[i];
                              }
                    }
                    System.out.println(s);
          }
          
}
