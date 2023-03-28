import java.util.*;
import java.io.*;

public class Battleship {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Battleship!" + "\n");
		char[][] player1Board = {
			{'-', '-', '-', '-', '-'},
			{'-', '-', '-', '-', '-'},
			{'-', '-', '-', '-', '-'},
			{'-', '-', '-', '-', '-'},
			{'-', '-', '-', '-', '-'},
		};
		for (int i = 0; i < player1Board.length; i++){
			System.out.println(String.format("Enter ship %d location:", i + 1));
			int x = 0;
			while (input.hasNextInt() == false && (x < 5 && x > -1)) {
				System.out.println("Invalid coordinates. Choose different coordinates.");
				input.next();
			}
			x = input.nextInt(););
			int y = 0;
			while (input.hasNextInt() == false && (y < 5 && y > -1)) {
				System.out.println("Invalid coordinates. Choose different coordinates.");
				input.next();
			}
			y = input.nextInt(););
			// Check if there's already a ship placed in the requested space
			if (player1Board[x][y] == '@') {
				System.out.println("You already have a ship there. Choose different coordinates.");
				i--;
			} else {
				playerBoard1[x][y] = '@';
			}
		}		
		printBattleShip(player1Board);
		for (int i = 1; i <= 100; i++) {
			System.out.print("\n");
		}
		char[][] player2Board = {
			{'-', '-', '-', '-', '-'},
			{'-', '-', '-', '-', '-'},
			{'-', '-', '-', '-', '-'},
			{'-', '-', '-', '-', '-'},
			{'-', '-', '-', '-', '-'},
		};
		for (int i = 0; i < player2Board.length; i++){
			System.out.println(String.format("Enter ship %d location:", i + 1));
			int x = 0;
			while (input.hasNextInt() == false && (x < 5 && x > -1)) {
				System.out.println("Invalid coordinates. Choose different coordinates.");
				input.next();
			}
			x = input.nextInt(););
			int y = 0;
			while (input.hasNextInt() == false && (y < 5 && y > -1)) {
				System.out.println("Invalid coordinates. Choose different coordinates.");
				input.next();
			}
			y = input.nextInt(););
			// Check if there's already a ship placed in the requested space
			if (player2Board[x][y] == '@') {
				System.out.println("You already have a ship there. Choose different coordinates.");
				i--;
			} else {
				playerBoard2[x][y] = '@';
			}
		}
		printBattleShip(player2Board);
		for (int i = 1; i <= 100; i++) {
			System.out.print("\n");
		}
	}

	// Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}
}