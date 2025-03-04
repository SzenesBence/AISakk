package Menu;

import GamePlay.Board.ChessBoard;
import GamePlay.Rules.GameStart;

import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.Play");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Selected: Play");
                    ChessBoard board = new ChessBoard();
                    board.loadBoard();
                    board.printBoard();
                }
                case 2 -> {
                    System.out.println("Exiting the program. Goodbye,");
                    scanner.close();
                    System.exit(0);
                }

                default -> System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}