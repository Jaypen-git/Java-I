import java.util.Scanner;

public class Battleship {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Battleship!" + "\n");
		System.out.println("PLAYER 1, ENTER YOUR SHIPS' COORDINATES.");
		char[][] player1 = placementPrompt(input);
		int player1Score = 0;
		char[][] p1FireHistory = createBoard();
		System.out.println("PLAYER 2, ENTER YOUR SHIPS' COORDINATES.");
		char[][] player2 = placementPrompt(input);
		int player2Score = 0;
		char[][] p2FireHistory = createBoard();
		boolean gameover = false;
		int currentPlayer = 1;
		//  game should run on a do-while
		do {
			if (currentPlayer == 1) {
				boolean player1Shot = firingPrompt(input, currentPlayer, player2, p1FireHistory);
				if (player1Shot == true) {
					player1Score++;
				}
				gameover = checkWinner(player1Score, player2Score, p1FireHistory, p2FireHistory);
				currentPlayer = 2;
			} else {
				boolean player2Shot = firingPrompt(input, currentPlayer, player1, p2FireHistory);
				if (player2Shot == true) {
					player2Score++;
				}
				gameover = checkWinner(player1Score, player2Score, p1FireHistory, p2FireHistory);
				currentPlayer = 1;
			}
		} while (gameover == false);
	}

	public static boolean checkWinner(int x, int y, char[][] p1, char[][] p2) {
		if (x == 5 || y == 5 ) {
			if (x == 5) {
				System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
			} else if (y == 5) {
				System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
			}
			System.out.println("Final boards:");
			printBattleShip(p1);
			printBattleShip(p2);
			return true;
		} else {
			return false;
		}
	}

	public static boolean firingPrompt(Scanner input, int player, char[][] oppBoard, char[][] history) {
		System.out.println(String.format("Player %d, enter hit row/column.", player));
		boolean repeat = true;
		int x = inputValidationLoop(input);
		int y = inputValidationLoop(input);

		do {
			if (history[x][y] == 'X' || history[x][y] == 'O') {
				System.out.println("You already fired there. Choose different coordinates");
				x = inputValidationLoop(input);
				y = inputValidationLoop(input);
			} else {
				repeat = false;
			}
		} while (repeat == true);

		if (oppBoard[x][y] == '@') {
			oppBoard[x][y] = 'X';
			history[x][y] = 'X';
			if (player == 2) {
				System.out.println("PLAYER 2 HIT PLAYER 1'S SHIP");
			} else {
				System.out.println("PLAYER 1 HIT PLAYER 2'S SHIP");
			}
			printBattleShip(history);
			return true;
		} else {
			oppBoard[x][y] = 'O';
			history[x][y] = 'O';
			printBattleShip(history);
			return false;
		}
	}

	public static char[][] placementPrompt(Scanner input) {
		char[][] playerBoard = createBoard();
		for (int i = 0; i < 5; i++) {
			System.out.println(String.format("Enter ship %d location:", i + 1));
			int x = inputValidationLoop(input);
			int y = inputValidationLoop(input);
			if (playerBoard[x][y] == '@') {
				System.out.println("You already have a ship there. Choose different coordinates.");
				i--;
			} else {
				playerBoard[x][y] = '@';
			}
		}
		printBattleShip(playerBoard);
		for (int i = 0; i <= 100; i++) {
			System.out.println();
		}
		return playerBoard;
	}

	public static char[][] createBoard() {
		char[][] board = {
			{'-', '-', '-', '-', '-'},
			{'-', '-', '-', '-', '-'},
			{'-', '-', '-', '-', '-'},
			{'-', '-', '-', '-', '-'},
			{'-', '-', '-', '-', '-'},
		};
		return board;
	}

	public static int inputValidationLoop(Scanner input) {
		int num = 0;
		boolean invalid = true;
		do {
			if (input.hasNextInt()) {
				num = input.nextInt();
				if (num < 5 || num > -1) {
					invalid = false;
				} else {
					System.out.println("Invalid coordinates. Enter different coordinates");
					input.nextLine();
				}
			} else {
				System.out.println("Invalid coordinates. Enter different coordinates");
				input.nextLine();
			}
		} while (invalid == true);
		return num;
	}

	public static boolean checkDuplicate(int[][] coordinateList, int[] coordinate) {
		boolean duplicate = false;
		int count = 0;
		for (int i = 0; i < coordinateList.length; i++) {
			if (coordinateList[i].equals(coordinate)) {
				duplicate = true;
			}
		}
		if (count > 1) {
			duplicate = true;
		}
		return duplicate;
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