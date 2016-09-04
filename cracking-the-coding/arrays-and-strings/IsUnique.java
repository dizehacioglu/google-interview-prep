import java.util.*;

public class IsUnique{

  public static void main(String[] args){
    String s = "abcdef ghijk lmnop";
    System.out.println(isUnique(s));
  }

  public static boolean isUnique(String s){
    ArrayList<Character> existingChars = new ArrayList<Character>();
    for (int i = 0; i < s.length(); i++) {
      if (existingChars.contains(s.charAt(i))) return false;
      if(s.charAt(i) != ' ') existingChars.add(s.charAt(i));
    }
    return true;
  }
}
