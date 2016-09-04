import java.util.*;
public class SortStack{
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(3);
    stack.push(4);
    stack.push(1);
    stack.push(2);
    stack.push(5);
    stack = sort(stack);
    System.out.println(stack);
  }

  public static Stack<Integer> sort(Stack<Integer> stack){
    Stack<Integer> tempStack = new Stack<Integer>();

    while(!stack.isEmpty()){
      int temp = stack.pop();
      while(!tempStack.isEmpty() && tempStack.peek() < temp){
        stack.push(tempStack.pop());
      }
      tempStack.push(temp);
    }

    return tempStack;
  }
}
