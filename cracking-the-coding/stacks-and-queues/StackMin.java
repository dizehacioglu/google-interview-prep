import java.util.*;
public class StackMin{
  ArrayList<StackNode> values = new ArrayList<StackNode>();

  public StackMin(){}

  public void push(int val){
    StackNode node = new StackNode(val);
    if(values.size() == 0) node.subMin = val;
    else if(values.get(values.size() - 1).subMin > val) node.subMin = val;
    else node.subMin = values.get(values.size() - 1).subMin;
    values.add(node);
  }

  public StackNode pop(int val){
    return values.remove(values.size() - 1);
  }

  public int min(){
    return values.get(values.size() - 1).subMin;
  }

  public static void main(String[] args) {
    StackMin stack = new StackMin();
    stack.push(1);
    stack.push(5);
    stack.push(3);
    stack.push(2);
    stack.pop(2);
    System.out.println(stack.min());
  }
}
