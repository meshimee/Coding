public class StringCompression {
    public static void main(String[] args) {
        String str = "wwwwaaadexxxxxx";

        // String ans = compress(str);
        // compressOne(str);
        String s = compressTwo(str);
        System.out.println(s);
    }

    private static String compressTwo(String str) {
        String s = str.charAt(0) + "";
        int k = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
                k++;
            } else {
                if (k > 1) {
                    s += k;
                    k = 1;
                }
                s += curr;
            }

        }
        if (k > 1) {
            s += k;
            k = 1;
        }

        return s;
    }

    private static void compress(String str) {
        int[] frq = new int[26];
        int k = 0;
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            frq[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (frq[str.charAt(i) - 'a'] > 0) {
                s += str.charAt(i);
            }

            // if(frq[str.charAt(i)-'a']>0){
            // k = frq[str.charAt(i)-'a'];
            // s += k;
            // }
        }
        System.out.println(s);
    }
}
