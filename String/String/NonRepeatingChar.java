package String;

public class NonRepeatingChar {
          public static void main(String[] args) {
                    String str = "leetcode";
                    int size = str.length();
                    nonRepeating(str,size); //USING O(N)
                    //non_repeatingChar(str,size); //USING O(N*N)
          }

          private static void nonRepeating(String str, int size) {
                int[] freq = new int[26];
                char[] s = str.toCharArray();

                for(int i = 0; i<size ; i++){
                        if(str.charAt(i) == ' ')
                        continue;

                        else{
                                freq[(int) str.charAt(i)]++;
                        }
                }
                for(int i = 0; i<200 ; i++){
                        System.out.print(freq[i]+" ");
                }
                for(int i = 0; i < size ; i++){
                        if(freq[(int) str.charAt(i)] == 1 && s[i] != ' ')
                        System.out.print(s[i]+" ");
                }
        }
        // private static void non_repeatingChar(String str, int size) {
        //             int[] freq = new int[200];
        //             char[] s = str.toCharArray();

        //             for(int i = 0 ; i < size ; i++){
        //                 freq[i] = 1;
        //                   for(int j = i+1 ; j < size ; j++){
        //                         if(s[i] == s[j]){
        //                                 freq[i]++;
        //                                 s[j] = '-';
        //                         }

        //                   }
        //             }
        //             for(int i = 0; i < size ; ++i){
        //                 if(freq[i] == 1 && s[i] != ' ' && s[i] != '-')
        //                 System.out.print(s[i] + " ");
        //             }     
        // }
        
                
}
