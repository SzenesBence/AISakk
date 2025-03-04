package GamePlay.Board;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChessBoard {
    private final int SIZE = 8;
    private final char[][] board = new char[SIZE][SIZE];
  public void loadBoard(){

      try (Scanner scanner = new Scanner(new File("src/main/resources/chess_start.txt"))) {
          for (int i = 0; i < SIZE; i++) {
              if (scanner.hasNextLine()) {
                  board[i] = scanner.nextLine().toCharArray();//nincsenek közök az üres sorokban
              }
          }
      } catch (FileNotFoundException e) {
          System.out.println("File not found!");
      }
  }
    public void printBoard() {
        for (char[] row : board) {
            System.out.println(row);
        }
    }

    public int getSIZE() {
        return SIZE;
    }

    public char[][] getBoard() {
        return board;
    }
}
