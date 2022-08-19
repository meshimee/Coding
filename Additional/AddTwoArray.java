import java.util.*;
class AddTwoArray{
          public static void main(String args[]){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Numbers of elements in array one : ");
                    int n1 = sc.nextInt();
                    System.out.println("Numbers of elements in array two : ");
                    int n2 = sc.nextInt();
                    int[] arr1 = new int[n1];
                    int[] arr2 = new int[n2];
                    System.out.println("Elements in array one : ");
                    for(int i = 0; i<n1 ; i++){
                              arr1[i] = sc.nextInt();
                    }
                    System.out.println("Elements in array two : ");
                    for(int i = 0; i<n2 ; i++){
                              arr2[i] = sc.nextInt();
                    }
                    int m = Math.max(n1, n2);
                    int[] ans = new int[m];

                    int i = n1-1;
                    int j = n2-1;
                    int k = m-1;
                    int carry = 0;
                    sc.close();
                    while(k>=0){
                              int sum = carry;
                              if(i >= 0)
                              sum += arr1[i];

                              if(j >= 0)
                              sum += arr2[j];

                              int q = sum/10;
                              int r = sum%10;
                              
                              ans[k] = r;
                              carry = q;
                              i--;
                              j--;
                              k--;
                    }
                    if(carry != 0)
                    System.out.print(carry+" ");
                    for(int p = 0; p<m ; p++){
                              System.out.print(ans[p]+" ");
                    }


          }
}