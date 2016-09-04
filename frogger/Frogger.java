// | X | X |   |   | X |   |
// |   | X | X |   |   |   |
// | X | X | X |   |   | X |
//                       O
// road with three lanes
// frog needs to cross the street
// with every move the frog makes, the cars move one cell to the right
// can the frog pass the road?
import java.util.*;
public class Frogger {
  public static void main(String[] args) {
    char[][] street = {
      {'X', 'X', ' ', ' ', 'X', ' '},
      {' ', 'X', 'X', ' ', ' ', ' '},
      {'X', 'X', 'X', ' ', ' ', 'X'}
    };

    char frog = 'O';

    for (int i = 0; i < street.length; i++) {
      System.out.println(Arrays.toString(street[i]));
    }

    moveCars(street);
    System.out.println("-----------------------");
    for (int i = 0; i < street.length; i++) {
      System.out.println(Arrays.toString(street[i]));
    }
  }

  public static boolean canCross(char[][] street, int positionofFrog){

    // can move up, down, left, right
    // move diagonally?


    return true;
  }

  public static void moveCars(char[][] street){
    for (int i = 0; i < street.length; i++) {
      if(street[i][street[0].length-1] == 'X'){
        street[i][street[0].length-1] = ' ';
      }
      for (int j = street[0].length-1; j > 0; j--) {
        street[i][j] = street[i][j-1];
      }
      if(street[i][0] == 'X'){
        street[i][0] = ' ';
      }
    }
  }

  public static void moveUp(char[][] street){

  }
  public static void moveDown(char[][] street){

  }
  public static void moveRight(char[][] street){
    
  }
  public static void moveLeft(char[][] street){

  }
}
