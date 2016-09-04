public class StringCompression {
  public static void main(String[] args) {
    String s = "aabcccccaaa"; // a2b1c5a3
    System.out.println(compress(s));
  }

  public static String compress(String s){
    String result = "";
    int consecutiveCount = 0;

    for (int i = 0; i < s.length(); i++) {
      consecutiveCount++;
      if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
        result += "" + s.charAt(i) + consecutiveCount;
        consecutiveCount = 0;
      }
    }
    return result;
  }
}
