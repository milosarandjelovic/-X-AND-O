package working;

import java.util.Scanner;

public class XAndO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] array = new String[9];
		String[] whoIsNext = new String[1];

		array = startGame(array, whoIsNext);

		while (!isGameOver(array) && gameScore(array) == 0) {
			System.out.print("Player '" + whoIsNext[0] + "' make your move: ");
			int position = s.nextInt();
			position = position - 1;
			if (isValidMove(position) && isFieldFree(array, position)) {
				makeAMove(array, position, whoIsNext[0]);
				playNext(whoIsNext);

				print(array);
				System.out.println();

			} else {
				System.out.println("Invalid position.");
			}
		}
		System.out.println("Game over!");
		if (gameScore(array) == 1) {
			System.out.println("Winner is X.");
		} else if (gameScore(array) == 2) {
			System.out.println("Winner is O.");
		} else {
			System.out.println("No winner.");
		}

	}

	public static void print(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
			if (i == 2) {
				System.out.println("");

			} else if (i == 5) {
				System.out.println("");
			}
		}

	}

	public static String[] startGame(String[] array, String[] whoIsNext) {

		for (int i = 0; i < array.length; i++) {
			array[i] = " ";
		}
		whoIsNext[0] = "x";
		return array;
	}

	public static boolean isFieldFree(String[] array, int position) {

		if (array[position] == " ") {
			return true;

		}
		return false;

	}

	public static String[] makeAMove(String[] array, int position, String sign) {
		array[position] = sign;
		return array;
	}

	public static String[] playNext(String[] whoIsNext) {

		if (whoIsNext[0] == "x") {
			whoIsNext[0] = "o";
		} else if (whoIsNext[0] == "o") {
			whoIsNext[0] = "x";
		}
		return whoIsNext;

	}

	public static boolean isGameOver(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == " ") {
				return false;
			}
		}
		return true;
	}

	public static boolean isWinner(String[] array, String sign) {
		boolean winner = false;
		if (array[0] == sign && array[1] == sign && array[2] == sign) {
			winner = true;
		} else if (array[3] == sign && array[4] == sign && array[5] == sign) {
			winner = true;
		} else if (array[6] == sign && array[7] == sign && array[8] == sign) {
			winner = true;
		} else if (array[0] == sign && array[3] == sign && array[6] == sign) {
			winner = true;
		} else if (array[1] == sign && array[4] == sign && array[7] == sign) {
			winner = true;
		} else if (array[2] == sign && array[5] == sign && array[8] == sign) {
			winner = true;
		} else if (array[0] == sign && array[4] == sign && array[8] == sign) {
			winner = true;
		} else if (array[2] == sign && array[4] == sign && array[6] == sign) {
			winner = true;
		}
		return winner;

	}

	public static boolean isValidMove(int position) {
		if (position < 9 && position >= 0) {
			return true;
		}
		return false;
	}

	public static int gameScore(String[] array) {
		if (isWinner(array, "x")) {
			return 1;
		} else if (isWinner(array, "o")) {
			return 2;
		} else {
			return 0;
		}
	}
}
