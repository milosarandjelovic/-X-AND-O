package working;

import java.util.Scanner;

public class XAndO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] array = { "x", "x", "o", "o", "x", "o", "x", "o", "x" };

		String[] whoIsNext = new String[1];
		array = startGame(array, whoIsNext);
		print(array);

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

	public static boolean isFieldFree(String[] array) {
		String x = "x";
		String o = "o";
		for (int i = 0; i < array.length; i++) {
			if (!array[i].equals(x) && !array[i].equals(o)) {
				return true;
			}
		}
		return false;
	}

	public static String[] makeAMuve(String[] array, int place, String sign) {
		array[place - 1] = sign;
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
		}

		if (array[0] == sign && array[3] == sign && array[6] == sign) {
			winner = true;
		} else if (array[1] == sign && array[4] == sign && array[7] == sign) {
			winner = true;
		} else if (array[2] == sign && array[5] == sign && array[8] == sign) {
			winner = true;
		}

		if (array[0] == sign && array[4] == sign && array[8] == sign) {
			winner = true;
		} else if (array[2] == sign && array[4] == sign && array[6] == sign) {
			winner = true;
		}
		return winner;

	}
}
