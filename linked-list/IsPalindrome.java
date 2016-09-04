public class IsPalindrome{
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.push(2);
    list.push(3);
    list.push(5);
    list.push(4);
    list.push(2);
    System.out.println(isPalindrome(list));
  }

  public static boolean isPalindrome(MyLinkedList list){
    for (int i = 0; i < list.length; i++) {
      if(list.get(i) != list.get(list.length - i - 1)) return false;
    }
    return true;
  }
}
