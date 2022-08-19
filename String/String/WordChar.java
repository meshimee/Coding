package String;

import java.util.Arrays;

public class WordChar {
          public static void main(String[] args) {
                    //String words[] = {"cat","bt","hat","tree"};
                    //String chars = "atach";          
                    // int ans = countCharacters(words, chars);
                    // System.out.println(ans);
                    //String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
                    // String[] sentences = {"w jrpihe zsyqn l dxchifbxlasaehj","nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom",
                    // "xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg","krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm",
                    // "rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr","o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk",
                    // "hrvh efqvjilibdqxjlpmanmogiossjyxepotezo","qstd zui nbbohtuk","qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"};

                    // int ans = mostWordFound(sentences);
                    //System.out.println(ans);
          }

          private static int mostWordFound(String[] sentences) {
                    int sum = 0;
                    int max = 0;
                    for(String s : sentences){
                              sum = 1;
                    for(int i = 0; i < s.length() ; i++){
                    if(s.charAt(i) == ' '){
                    sum++;
                     }
                     max = Math.max(sum,max);
            }

        }
        return max;
}

          private static int countCharacters(String[] words, String chars) {
                    int sum = 0;
                    int[] freq = new int[26];

                    for(char ch : chars.toCharArray()){
                              freq[ch - 'a']++;
                    }

                    for(String word : words){
                              int[] temp = Arrays.copyOf(freq, freq.length);
                              int sum_count = 0;
                              for(char c : word.toCharArray()){
                                        if(temp[c - 'a'] > 0){
                                                  sum_count++;
                                                  temp[c-'a']--;
                                        }
                              }
                              if(sum_count == word.length())
                              sum += sum_count;
                    }
                    return sum;
          }
}
