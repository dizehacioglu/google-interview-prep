import java.util.*;
public class Permutation {

  public static void main(String[] args){
    String s1 = "abc";
    String s2 = "dca";

    System.out.println(isPerm(s1, s2));
  }

  public static boolean isPerm(String s1, String s2){
    if(s1.length() != s2.length()) return false;

    char[] a = s1.toCharArray();
    char[] b = s2.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    return Arrays.equals(a,b);



    // Hashtable<String, Character> hash = new Hashtable<String, Character>();
    //
    // for (int i = 0; i < s1.length(); i++) {
    //   hash.
    // }


    // return true;
  }

  public static void perms(String s){

  }

}
