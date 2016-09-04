import java.util.*;

public class RemoveDups {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.push(5);
    list.push(6);
    list.push(7);
    list.push(8);
    list.push(7);
    list.push(10);
    // System.out.println(list.get(0));
    // System.out.println(list.get(1));
    // System.out.println(list.get(2));
    // System.out.println(list.get(3));
    for (int i = 0; i < list.length; i++) {
      System.out.println(list.get(i));
    }
    removeDups(list);
    for (int i = 0; i < list.length; i++) {
      System.out.println(list.get(i));
    }
  }

  public static void removeDups(MyLinkedList list){
    ArrayList<Integer> listOfNums = new ArrayList<Integer>();
    for (int i = 0; i < list.length; i++) {
      if(listOfNums.contains(list.get(i))){
        list.remove(i);
      } else {
        listOfNums.add(list.get(i));
      }
    }
  }
}
