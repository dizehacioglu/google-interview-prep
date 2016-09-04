import java.util.*;

public class RandomGoogleQuestion{
  public static void main(String[] args){
    int[] numbers = {1,0};
    int[] nums2 = {1,2,1};
    int[] nums3 = {1,3,0,1};
    System.out.println(answer(numbers));
    System.out.println(answer(nums2));
    System.out.println(answer(nums3));
  }

  public static int answer(int[] numbers){
    Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();

    // int i = 0;
    //
    // while(i < numbers.length-1){
    //   if(numbers[i] == 0) break;
    //   int hashKey = hash(numbers[i], numbers[i+1]);
    //   if(!hash.containsKey(hashKey)) hash.put(hashKey, 1);
    //   i++;
    // }
    for(int i = 1; i < numbers.length-1; i++){
      int hashKey = hash(numbers[i], i);
      if(!hash.containsKey(hashKey)) hash.put(hashKey, 1);
    }
    System.out.println(hash.toString());
    // if(numbers.length == 2) return 2;

    return hash.keySet().size();
  }

  public static int hash(int num1, int num2){
    return (num1 * 10) + num2;
  }


}
