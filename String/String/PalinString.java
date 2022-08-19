package String;

public class PalinString {
  public static void main(String args[]) {
    // String[] words = {"abc","car","ada","racecar","cool"};
    // String[] word = {"notapalindrome","racecar"};
    String[] s = { "def", "ghi" };
    // System.out.println(firstPalindrome(words));
    String sn = (firstPalindrome(s));
    if (sn == "")
      System.out.println("Not Palindrome");

    else
      System.out.println("Yes Palindrome");

  }

  public static String firstPalindrome(String[] words) {
    for (String word : words) {
      if (isPalindrom(word)) {
        return word;
      }
    }
    return "";

  }

  private static boolean isPalindrom(String str) {
    int i = 0;
    int j = str.length() - 1;

    while (i < j) {
      if (str.charAt(i) == str.charAt(j)) {
        i++;
        j--;
        continue;
      } else
        return false;
    }
    return true;
  }

}
