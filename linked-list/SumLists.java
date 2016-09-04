public class SumLists {
  public static void main(String[] args) {
    MyLinkedList list1 = new MyLinkedList();
    MyLinkedList list2 = new MyLinkedList();

    list1.push(7);
    list1.push(1);
    list1.push(6);

    list2.push(5);
    list2.push(9);
    list2.push(2);

    System.out.println(sumLists(list1, list2));

  }

  public static int sumLists(MyLinkedList list1, MyLinkedList list2){
    String num1String = "";
    String num2String = "";
    for (int i = list1.length - 1; i >= 0; i--) {
      num1String += list1.get(i);
    }
    for (int i = list2.length - 1; i >= 0; i--) {
      num2String += list2.get(i);
    }
    int num1 = Integer.parseInt(num1String);
    int num2 = Integer.parseInt(num2String);

    return num1+num2;
  }
}
