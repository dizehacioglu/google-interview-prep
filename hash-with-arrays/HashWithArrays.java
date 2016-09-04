import java.util.HashMap;
import java.util.Hashtable;

public class HashWithArrays {
  public static void main(String[] args){

    String[] keys = {"a", "b", "c", "d", "e"};
    int[] values = {1, 2, 3, 4, 5};

    // The HashMap way
    // HashMap<String, Integer> hash = new HashMap<String, Integer>();

    // The HashTable way
    Hashtable<String, Integer> hash = new Hashtable<String, Integer>();

    for (int i = 0; i < keys.length; i++) {
      hash.put(keys[i], values[i]);
    }

    System.out.println(hash.toString());
  }
}
