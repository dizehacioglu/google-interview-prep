import java.util.*;

public class Tree{
  public static void main(String[] args){

    Tree binTree = new Tree();

    binTree.insertIteratively(5);
    binTree.insertIteratively(3);
    binTree.insertIteratively(4);
    // System.out.println(binTree.root.value);
    // System.out.println(binTree.root.right.value);
    // System.out.println(binTree.root.left);
    binTree.insertIteratively(2);
    binTree.insertIteratively(7);
    binTree.insertIteratively(6);
    // System.out.println(binTree.root.left.value);
    // System.out.println(binTree.containsIteratively(2));
    // System.out.println(binTree.containsIteratively(5));
    // System.out.println(binTree.containsIteratively(1));
    // System.out.println(binTree.containsIteratively(3));
    // System.out.println(binTree.containsIteratively(4));
    System.out.println(binTree.breadthFirstSearch());
    System.out.println(binTree.dfsPre());

  }

  Node root = null;

  public Tree(){}

  public void insertIteratively(int val){
    Node newNode = new Node(val, null, null);

    if(this.root == null){
      this.root = newNode;
    } else {
      Node current = this.root;

      while(true){
        if(val < current.value) {
          if(current.left == null){
            current.left = newNode;
            break;
          } else {
            current = current.left;
          }
        } else if(val > current.value){
          if(current.right == null){
            current.right = newNode;
            break;
          } else {
            current = current.right;
          }
        } else if(val == current.value){
          System.out.println("Duplicate");
          break;
        }
      }
    }
  }

  public void insertRecursively(int val){
    Node newNode = new Node(val, null, null);

    if(this.root == null) this.root = newNode;


  }

  public boolean containsIteratively(int val){
    Node current = this.root;

    while(current != null){
      if(current.value == val) return true;
      else if(val < current.value) current = current.left;
      else if(val > current.value) current = current.right;
    }

    return false;
  }

  public ArrayList<Integer> breadthFirstSearch(){
    Node node = this.root;
    ArrayList<Node> queue = new ArrayList<Node>();
    queue.add(node);
    ArrayList<Integer> data = new ArrayList<Integer>();

    while(queue.size() > 0){
      node = queue.get(0);
      data.add(node.value);
      if(node.left != null) queue.add(node.left);
      if(node.right != null) queue.add(node.right);
      queue.remove(0);
    }

    return data;
  }

  public ArrayList<Integer> dfsPre(){
    ArrayList<Integer> data = new ArrayList<Integer>();
    Node current = this.root;

    search(current, data);

    return data;
  }

  public static void search(Node n, ArrayList<Integer> data){
    data.add(n.value);
    if(n.left != null) search(n.left, data);
    if(n.right != null) search(n.right, data);
  }


}
