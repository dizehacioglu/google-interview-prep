public class Intersection{
  public static void main(String[] args) {
    MyLinkedList list1 = new MyLinkedList();
    MyLinkedList list2 = new MyLinkedList();

    Node shared = new Node(11);

    list1.push(2);
    list1.pushNode(shared);
    list1.push(2);
    list1.push(5);

    list2.push(2);
    list2.push(11);
    list2.pushNode(shared);
    list2.push(5);

    // System.out.println(list1.getNodeAt(1) == list2.getNodeAt(1));
    // System.out.println(list2.getNodeAt(1));
    System.out.println(intersects(list1, list2));
  }

  public static Node intersects(MyLinkedList list1, MyLinkedList list2){
    for (int i = 0; i < list1.length; i++) {
      for(int j = 0; j < list2.length; j++){
        if(list1.getNodeAt(i) == list2.getNodeAt(j)) return list1.getNodeAt(i);
      }
    }
    return null;
  }
}
