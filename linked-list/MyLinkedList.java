public class MyLinkedList{
  public static void main(String[] args){

    MyLinkedList list = new MyLinkedList();
    System.out.println(list.head);
    list.push(5);
    list.push(6);
    list.push(7);
    list.push(8);
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    list.reverse();
    System.out.println("---------");
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    // System.out.println(list.head.val);
    // System.out.println(list.tail.val);
    // System.out.println(list.length);
    // System.out.println(list.getNodeAt(0).val);
    // System.out.println(list.pop().val);
    // System.out.println(list.tail.val);
    // list.unshift(4);
    // System.out.println(list.head.val);
    // System.out.println(list.head.next.val);
    // System.out.println(list.shift().val);
    // System.out.println(list.head.next.val);
    // System.out.println(list.head.val);
    // System.out.println(list.get(3));
    // list.set(99, 1);
    // System.out.println(list.head.next.val);
    // System.out.println(list.length);
    // System.out.println(list.remove(1).val);
    // System.out.println(list.length);
    // System.out.println(list.head.val);
    // System.out.println(list.head.next.val);
  }

  Node head = null;
  Node tail = null;
  int length = 0;

  public MyLinkedList(){}

  public Node getNodeAt(int index){
    if(index >= this.length || index < 0){
      return null;
    }

    Node curNode = this.head;
    for (int i = 0; i < index; i++) {
      if(curNode != null){
        curNode = curNode.next;
      }
    }
    return curNode;
  }

  public void clear(){
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  public void push(int val){
    Node newNode = new Node(val);
    if(this.head == null){
      this.head = newNode;
      this.tail = this.head;
    } else {
      this.tail.next = newNode;
      this.tail = newNode;
    }
    this.length++;
  }
  
  public void pushNode(Node n){
    if(this.head == null){
      this.head = n;
      this.tail = this.head;
    } else {
      this.tail.next = n;
      this.tail = n;
    }
    this.length++;
  }

  public Node pop(){
    // Base cases
    if(this.length == 0) return null;
    else if(this.length == 1){
      Node wantedNode = this.head;
      this.clear();
      return wantedNode;
    }

    // Need to return the last Node's value,
    // Reassign second to last node as the tail,
    // And decrement the lenght of the list
    Node secondToLast = this.getNodeAt(this.length - 2);
    Node temp = this.tail;
    this.tail = secondToLast;
    this.length--;

    // This returns the right value I hope
    return temp;
  }

  public void unshift(int val){
    Node newNode = new Node(val);
    // If the list is empty
    // Make this new value the head and the tail of the list
    if(this.length == 0){
      this.head = newNode;
      this.tail = this.head;
    } else {
      // If it's not empty
      // Set current head to head.next
      // Assign newNode to the head
      Node temp = this.head;
      this.head = newNode;
      this.head.next = temp;
    }
  }

  public Node shift(){
    if(this.length == 0){
      return null;
    } else if(this.length == 1){
      Node wantedNode = this.head;
      this.clear();
      return wantedNode;
    }

    Node wantedNode = this.head;
    this.head = this.head.next;

    return wantedNode;
  }

  public int get(int index){
    if(this.length == 0 || index > this.length) return 0;
    else if(this.length == 1) return this.head.val;

    return this.getNodeAt(index).val;
  }

  public void set(int val, int index){
    if(this.length == 0 || index > this.length) {
      System.out.println("Can't do that");
    }

    this.getNodeAt(index).val = val;
  }

  public Node remove(int index){
    if(this.length == 0) return null;
    else if(this.length == 1){
      Node wantedNode = this.head;
      this.clear();
      return wantedNode;
    }
    Node nodeToRemove = this.getNodeAt(index);

    Node prevNode = this.getNodeAt(index - 1);
    Node nextNode = this.getNodeAt(index + 1);

    prevNode.next = nextNode;
    this.length--;

    return nodeToRemove;
  }

  public void reverse(){
    for (int i = this.length-1; i >= 1; i--) {
      Node curNode = this.getNodeAt(i);
      curNode.next = this.getNodeAt(i-1);
    }
    Node oldHead = this.head;
    Node oldTail = this.tail;
    this.tail = oldHead;
    this.head = oldTail;
  }

  public void recursiveReverse(){

  }


}
