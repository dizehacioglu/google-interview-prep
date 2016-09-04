// Describe how you would use a single array to implement three stacks
import java.util.*;
public class ThreeInOne {
  int numberOfStacks = 3;
  int stackCapacity;
  int[] values;
  int[] sizes;

  public ThreeInOne(int stackSize){
    this.stackCapacity = stackSize;
    values = new int[stackSize * numberOfStacks];
    sizes = new int[numberOfStacks];
  }

  public void push(int stackNum, int val){
    // TODO: check for full
    sizes[stackNum-1]++;
    values[indexOfTop(stackNum)] = val;
  }

  public int indexOfTop(int stackNum){
    int offset = stackNum * stackCapacity;
    System.out.println(offset);
    int size = sizes[stackNum-1];
    return offset * size - 1;
  }

  public static void main(String[] args) {
    ThreeInOne arr = new ThreeInOne(5);
    arr.push(1, 2);
    arr.push(1, 2);
    // arr.push(3, 2);
    System.out.println(Arrays.toString(arr.values));
    System.out.println(Arrays.toString(arr.sizes));
  }
}
