import java.util.*;
public class PalindromePermutation{

  public static void main(String[] args){
    String s = "taco cat ";
    System.out.println(isPalinPerm(s));
  }

  public static boolean isPalinPerm(String s){
    s = s.toLowerCase();
    if(s == null || s.length() <= 1){
      return true;
    }

    Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>();

    for (int i = 0; i < s.length(); i++) {
      if(s.charAt(i) != ' ') {
        if(hash.containsKey(s.charAt(i))){
          int count = hash.get(s.charAt(i));
          count++;
          hash.put(s.charAt(i), count);
        } else {
          hash.put(s.charAt(i), 1);
        }
      }
    }

    System.out.println(hash);

    Set<Character> keys = hash.keySet();
    int count = 0;

    for(Character key : keys){
      if(hash.get(key) % 2 != 0){
        count++;
        if(count > 1) return false;
      }
    }
    return true;
  }
}
