public class WordSentence {
      public static void main(String[] args) {
                String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
                int max = 0;
                
                for(String s : sentences){
                    int c = 1;  
                for(int i = 0; i<s.length() ; i++){
                    if(s.charAt(i) == ' ')
                    c++;
                }
                max = Math.max(max,c);
          }
           
                System.out.println(max);
      }    
}
