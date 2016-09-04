import java.util.*;

public class OneAway {

  public static void main(String[] args){
    System.out.println(isOneAway("pale", "bale"));
  }

  public static boolean isOneAway(String s1, String s2){
    int[] s1Hash = new int[26];
    int[] s2Hash = new int[26];

    for(char c : s1.toCharArray()){
      s1Hash[calcHash(c)]++;
    }
    for(char c : s2.toCharArray()){
      s2Hash[calcHash(c)]++;
    }

    int changes = 0;
    System.out.println(Arrays.toString(s1Hash));
    System.out.println(Arrays.toString(s2Hash));

    for(int i = 0; i < s1Hash.length; i++){
      // System.out.println(i);
      // System.out.println("Comparing " + s1Hash[i] + " and " + s2Hash[i]);
      if(s1Hash[i] != s2Hash[i]) {
        if(s1Hash[i] - s2Hash[i] < 0) changes += -(s1Hash[i] - s2Hash[i]);
        else{
          changes += s1Hash[i] - s2Hash[i];
        }
      }
      // System.out.println(changes);
      if(changes > 1) return false;
    }

    return true;
  }

  public static int calcHash(char c){
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    int val = Character.getNumericValue(c);

    return val - a;
  }

}
