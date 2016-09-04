import java.util.*;

public class ZeroMatrix {
  public static void main(String[] args) {

    int[][] matrix = {
    {1,2,3,4,5,6,7,8,0,9},
    {2,3,4,5,6,3,4,5,8,1},
    {3,3,5,7,2,6,7,8,2,1},
    {5,8,2,0,5,3,2,1,4,1}
    };
    // int[][] matrix = {
    // {1,2,3,4},
    // {2,3,0,5},
    // {3,3,5,7},
    // {5,8,2,9,}
    // };

    int[][] newMatrix = setZeros(matrix);

    for (int i = 0; i < newMatrix.length; i++) {
      for (int j = 0; j < newMatrix[0].length; j++) {
        System.out.print(newMatrix[i][j] + " ");
      }
      System.out.println();
    }

    // System.out.println(setZeros(matrix));

  }

  public static int[][] setZeros(int[][] matrix){
    ArrayList<Integer> rows = new ArrayList<Integer>();
    ArrayList<Integer> columns = new ArrayList<Integer>();

    for (int i = 0; i < matrix.length; i++) {
      // System.out.println("Row " + i);
      for (int j = 0; j < matrix[0].length; j++) {
        // System.out.println("Column" + j);
        if(matrix[i][j] == 0){
          rows.add(i);
          columns.add(j);
        }
      }
    }

    for (int i = 0; i < rows.size(); i++) {
      for(int j = 0; j < matrix[0].length; j++){
        matrix[rows.get(i)][j] = 0;
      }
    }

    for (int i = 0; i < columns.size(); i++) {
      for(int j = 0; j < matrix.length; j++){
        matrix[j][columns.get(i)] = 0;
      }
    }

    return matrix;
  }
}
