package String;

import java.util.*; 
class Main {

  public static String MatchingCharacters(String str) {
    int count = Integer.MIN_VALUE;

    for(int i = 0; i < str.length() ; i++){
      int first = str.indexOf(str.charAt(i));
      int last = str.lastIndexOf(str.charAt(i));

      if(first != last){
        count = Math.max(count,uniqueChar(str,first,last));
      }
    }  
    String s = String.valueOf(count);
    return s;
  }
  public static int uniqueChar(String str, int first,int last){
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i = first+1; i<last ; i++){
      map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
    }
    int res = 0;
    for(char c : map.keySet()){
      if(map.get(c) == 1)
        res += 1;
    }
    return res;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(MatchingCharacters(s.nextLine())); 
    s.close();
  }

}