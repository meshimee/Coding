import java.util.Arrays;
import java.util.Scanner;

public class Football {
          public static void main(String[] args) {
                    Scanner sb = new Scanner(System.in);
                    int teams = sb.nextInt();

                    String str = sb.nextLine();

                    int scores[] = new int[teams];
                    Arrays.fill(scores,0);
                  
                    for(int i = 0 ; i < (teams*(teams-1))/2 ; i++){
                              String s1 = sb.nextLine();
                              char home = s1.charAt(0);
                              char away = s1.charAt(2);

                              String h_score = "";
                              String a_score = "";

                              int j = 4;
                              while(s1.charAt(j) != '-'){
                                        h_score += s1;
                                        j++;
                              }
                              j++;
                              int x = Integer.parseInt(s1);
                              while(j < s1.length()){
                                        a_score += s1;
                              }
                              int y = Integer.parseInt(s1);

                              if(x < y){
                                 scores[away - 'A'] += 3;
                              }
                              else if(x == y){
                                        scores[away = 'A'] += 1;
                                        scores[home = 'A'] += 1;
                              }
                              else{
                                        scores[home = 'A'] += 3;
                              }
                    }
                    int index = -1;
                    int maxv = -999999; 
                    for(int i = 0; i < teams ; i++){
                              if(scores[i] > maxv){
                                        maxv = scores[i];
                                        index = i;
                              }
                    }
                    System.out.println((char)('A' + index));        
                    sb.close();
                    
          }
}

//A B 2-1
//C B 6-5
//A C 3-4
//OUTPUT : C
//         6
