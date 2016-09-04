import java.util.*;
public class SetOfStacks {
  int stackCapacity;
  ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();

  public SetOfStacks(int capacity){
    this.stackCapacity = capacity;
  }

  public void push(int val){
    if(stacks.size() == 0){
      stacks.add(new Stack<Integer>());
      stacks.get(0).push(val);
    }
    else {
      Stack<Integer> notYetFullStack = null;
      for(int i = 0; i < stacks.size(); i++){
        if(stacks.get(i).size() < this.stackCapacity){
          notYetFullStack = stacks.get(i);
        }
      }
      if(notYetFullStack == null){
        stacks.add(new Stack<Integer>());
        notYetFullStack = stacks.get(stacks.size()-1);
      }

      notYetFullStack.push(val);
    }
  }

  public int pop(){
    Stack<Integer> lastStack = stacks.get(stacks.size() - 1);
    if(lastStack.size() == 0) stacks.remove(stacks.size() - 1);
    return stacks.get(stacks.size() - 1).pop();
  }

  public int popAt(int index){
    int popped = stacks.get(index).pop();
    for (int i = index; i < stacks.size(); i++) {
      Stack<Integer> currStack = stacks.get(i);
      // if(currStack.size() < 3) 

    }

    return popped;
  }

  public static void main(String[] args) {
    SetOfStacks stack = new SetOfStacks(3);
    stack.push(5);
    stack.push(6);
    stack.push(6);
    stack.push(7);
    stack.push(9);
    stack.push(6);
    stack.push(3);
    stack.push(6);
    stack.push(345);
    stack.push(87);
    stack.push(12);
    stack.push(3);
    stack.push(9);
    stack.push(65);
    stack.push(1);
    System.out.println(stack.stacks.toString());
    stack.pop();
    System.out.println(stack.stacks.toString());
    stack.pop();
    System.out.println(stack.stacks.toString());
    stack.pop();
    System.out.println(stack.stacks.toString());
    stack.pop();
    System.out.println(stack.stacks.toString());
    stack.popAt(2);
    System.out.println(stack.stacks.toString());
  }
}
