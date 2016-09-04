import java.util.*;

public class mergeSort {
  public static void main(String [] args){
    // Merge Sort Algorithm Solution
    // recursively divide collection in half until only one (or no) element remains
    // merge each of those "lists" by comparing first element of each list
    List<Integer> nums = new ArrayList<Integer>();
    nums.add(3);
    nums.add(2);
    nums.add(4);
    // nums.add(1);
    // nums.add(5);
    // nums.add(6);
    System.out.println(nums.toString());

    List<Integer> sorted = split(nums);

    System.out.println(sorted.toString());
  }

  public static List<Integer> split(List<Integer> array){
    if(array.size() <= 1){
      return array;
    }

    int mid = array.size() / 2;
    List<Integer> left = array.subList(0, mid);
    List<Integer> right = array.subList(mid, array.size());

    left = split(left);
    right = split(right);

    System.out.println("Left = " + left.toString());
    System.out.println("Right = " + right.toString());
    List<Integer> result = merge(left, right);
    System.out.println("Result = " + result.toString());

    return result;
  }

  public static List<Integer> merge(List<Integer> array1, List<Integer> array2){
    List<Integer> sortedArr = new ArrayList<Integer>();;
    Iterator<Integer> it1 = array1.iterator();
    Iterator<Integer> it2 = array2.iterator();

    // System.out.println(it1.next());
    // System.out.println(it2.next());

    int x = it1.next();
    int y = it2.next();
    System.out.println(x);
    System.out.println(y);

    // System.out.println(x, y);

    while(true){
      if(x <= y){
        sortedArr.add(x);
        if(it1.hasNext()){
          x = it1.next();
        } else {
          sortedArr.add(y);
          while(it2.hasNext()){
            sortedArr.add(it2.next());
          }
          break;
        }
      } else {
        sortedArr.add(y);
        if(it2.hasNext()){
          y = it2.next();
        } else {
          sortedArr.add(x);
          while(it1.hasNext()){
            sortedArr.add(it2.next());
          }
          break;
        }
      }
    }
    // while(it1.hasNext() && it2.hasNext()){
    //   System.out.println("has next");
    //   if(x > y){
    //     sortedArr.add(y);
    //     if(it2.hasNext()) y = it2.next();
    //   } else {
    //     sortedArr.add(x);
    //     if(it1.hasNext()) x = it1.next();
    //   }
    // }

    return sortedArr;
  }


}
