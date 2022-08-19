import java.util.Arrays;

public class IsPangram {
          public static boolean checkIfPangram(String sentence) {
                    sentence = sentence.toLowerCase();
                     int[] frq = new int[26];
                     Arrays.fill(frq,0);
                     for(int i = 0; i<sentence.length() ; i++){
                         char ch = sentence.charAt(i);
                         int index = ch-'a';
                         frq[index]++;
                    }
                     boolean flag = true;
                     for(int i = 0; i<frq.length ; i++){
                         if(frq[i] == 0){
                             flag = false;
                             break;
                         }
                     }
                     return flag;
                     
                 }
          public static void main(String[] args) {
                    String str = "The quick fox jumps over the LazY Dog";
                    boolean ans = checkIfPangram(str);
                    System.out.println(ans);
                    // int[] frq = new int[26];
                    // Arrays.fill(frq,0);
                    // str = str.toLowerCase();

                    // for(int i = 0; i<str.length() ; i++){
                    //           char ch = str.charAt(i);
                    //           int index = (int)ch - 'a';
                    //           frq[index]++;
                    // }
                    // boolean flag = false;

                    // for(int i = 0; i < frq.length ; i++){
                    //           if(frq[i] == 0){
                    //           flag = true;
                    //           break;
                    //           }
                    // }
                    // if(flag == false) System.out.println("Yes");

                    // else  System.out.println("No");
                    
                    // char[] ch = str.toCharArray();
                    // for(int i = 0;  i<str.length() ; i++){
                    //           if(ch[i] >= 65 && ch[i] <= 90){
                    //                     // ch[i] = (char) (ch[i] + 32); 
                    //                     ch[i] =  (char) ((char) ch[i] + 32);
                    //           }
                    // }
                    // System.out.println(str);
                    
                   
          }
}
//"the quick fox jumps over the lazy dog"