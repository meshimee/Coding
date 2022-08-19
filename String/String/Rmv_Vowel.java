//Remove characters from a string except alphabets
package String;

public class Rmv_Vowel {
          public static void main(String[] args) {
                    String s = "I am very happy today";
                    remove(s);
          }

          private static void remove(String str) {
                    str = str.toLowerCase();
                    // String s = "";
                    //for(int i = 0; i < s.length()-1; i++){
                              // char ch = s.charAt(i);
                              // if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch=='u'){
                              //           continue;
                              // }
                              // else
                              // s += ch;
                              System.out.println(str);
                              for (int i = 0; i < str.length(); i++) {
                                        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                                          str = str.substring(0, i) + str.substring(i + 1);
                                          System.out.println(str);
                                          i--;
                                        }
                               }
                    }
          
          }

