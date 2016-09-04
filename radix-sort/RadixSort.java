import java.util.*;

public class RadixSort{
  public static void main(String[] args) {
    int[] nums = {877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567};
    // System.out.println(Arrays.toString(nums));
    sort(nums);
    // System.out.println(Arrays.toString(nums));
  }

  public static void sort(int[] a){
    int m = a[0];
    int exp = 1;
    int n = a.length;
    int[] b = new int[10];
    for (int i = 1; i < n; i++){
      if (a[i] > m) m = a[i];
    }
    while (m / exp > 0)
    {
        int[] bucket = new int[10];

        for (int i = 0; i < n; i++){
            bucket[(a[i] / exp) % 10]++;
        }
        System.out.println(Arrays.toString(bucket));
        for (int i = 1; i < 10; i++)
            bucket[i] += bucket[i - 1];
        System.out.println(Arrays.toString(bucket));
        // WHAT THE FUCK IS HAPPENING HERE
        for (int i = n - 1; i >= 0; i--){
          int stuff = --bucket[(a[i] / exp) % 10];
          System.out.println(stuff);
          b[stuff] = a[i];
        }
        System.out.println(Arrays.toString(bucket));
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < n; i++)
            a[i] = b[i];
        // System.out.println(Arrays.toString(a));
        exp *= 10;
        System.out.println("******");
    }
  }
}
