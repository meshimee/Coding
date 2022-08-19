package String;

public class StringCompression {
          public static void main(String[] args) {
                   char[] chars = {'a','a','b','b','c','c','c'};
                   int n = stringCompression(chars);
                   System.out.println(n);
          }

          private static int stringCompression(char[] arr) {
                    String str = String.copyValueOf(arr);
                    String s = str.charAt(0) + "";
		int k = 1;
		for(int i = 1 ; i < str.length() ; i++){
		    char curr = str.charAt(i);
		    char prev = str.charAt(i-1);
		    
		    if(curr == prev){
		        k++;
		    }
		    else{
		        if(k > 1){
		            s += k;
		            k = 1;
		        }
		        s += curr;
		    }
		    
		}
		if(k > 1){
		    s += k;
		    k = 1;
		}
                    System.out.println(s);
                    return s.length();      	
	}
}

