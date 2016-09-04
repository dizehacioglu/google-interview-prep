public class KthElement{
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.push(5);
    list.push(6);
    list.push(7);
    list.push(8);
    System.out.println(kthEl(list, 0));
  }

  // Find the kth to last element
  public static int kthEl(MyLinkedList list, int k){
    if(k > list.length || k < 0) return 0;
    int index = list.length - k;
    return list.get(index);
  }
}
