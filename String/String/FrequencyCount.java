package String;

import java.util.Arrays;

public class FrequencyCount {
          public static void main(String[] args) {
                    String str = "takeyouforward";//a2 d1 e1 f1 k1 o1 r2 t1 u1 w1
                    //countFrequency(str);
                    UsingFrquencyArray(str);
          }

          private static void UsingFrquencyArray(String str) {
                    int[] temp = new int[26];
                    for(int i = 0; i<str.length() ; i++){
                              temp[str.charAt(i) - 'a']++;
                    }
                    for(int i = 0; i<26 ; i++){
                              if(temp[i] != 0){
                              System.out.print((char) (i+'a'));
                              System.out.print(temp[i]+" ");
                              }
                              
                    }
          }
          private static void countFrequency(String str) {
                    str = Sorting(str); //aadefkoorrtuwy
                    int count = 1;
                    for(int i = 1 ; i<str.length() ; i++){
                              char ch = str.charAt(i-1);
                              if(ch == str.charAt(i))
                              count++;

                              else{
                                        System.out.print(ch);
                                        System.out.print(count+" ");
                                        ch = str.charAt(i);
                                        count = 1;
                              }
                    }   
          }
                    private static String Sorting(String str) {
                    char[] arr = str.toCharArray();
                    Arrays.sort(arr);
                    return new String(arr);
          }
}
