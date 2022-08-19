import java.util.*;

public class SubTwoArray{

public static void main(String[] args) throws Exception {
   Scanner sc = new Scanner(System.in);
   int n1 = sc.nextInt();
  
   int[] a1 = new int[n1];
   for(int i =0;i<n1 ; i++){
       a1[i] = sc.nextInt();
    }
    int n2 = sc.nextInt();
    int[] a2 = new int[n2];
    for(int i =0; i<n2 ; i++){
        a2[i] = sc.nextInt();
    }
    sc.close();
    int[] ans = new int[n2];
    
    int i = n1-1;
    int j = n2-1;
    int k = n2 - 1;
    int borrow = 0;
    
    while(k >= 0){
    int diff = a2[j] - borrow;
    
    if(i>=0){
        diff -= a1[i];
    }
    if(diff < 0){
        diff += 10;
        borrow = 1;
    }
    else
        borrow = 0;
        
    ans[k] = diff;
    i--;
    j--;
    k--;
    
    }
    i = 0;
    while(ans[i]==0){
        i++;
    }
    for(int p = 0; p<n2 ; p++){
        System.out.println(ans[i]);
    }
   
 }

}