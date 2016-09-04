import java.util.*;

public class Polish{
  public static void main(String[] args) {
    String s = "1 1 + 2 *";
    solvePolish(s);
    // System.out.println(solvePolish(s));
  }

  public static int solvePolish(String s){
    LinkedList<Character> ll = new LinkedList<Character>();
    for (int i = 0; i < s.length(); i++) {
      if(s.charAt(i) != ' ') ll.add(s.charAt(i));
    }

    while(ll.size() >= 1){
      if(ll.get(0) == '+'){
        int x = ll.get(0).prev;
        int y = ll.get(0).prev.prev;
        System.out.println(x);
        System.out.println(y);
      }

      ll.remove(0);
    }

    System.out.println(ll.toString());
    // return ll.get(0).value;
    return 1;
  }

}
