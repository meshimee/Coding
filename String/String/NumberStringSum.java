package String;

public class NumberStringSum {
          public static void main(String[] args) {
                   String str= "1bc268";
                   int ans = sumNum(str); 
                   System.out.println(ans);   
          }

          private static int sumNum(String str) {
                    String numSum = "0";
                    int sum = 0;
                    for(int i = 0 ; i<str.length() ; i++){
                              char ch = str.charAt(i);
                              if(Character.isDigit(ch)){
                                        numSum += ch;
                              }
                              else{
                                        sum += Integer.parseInt(numSum);
                                        numSum = "0";
                              }
                    }
                    return sum + Integer.parseInt(numSum);
                    
          }
}
