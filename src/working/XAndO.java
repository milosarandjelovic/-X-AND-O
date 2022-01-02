package working;

import java.util.Scanner;

public class XAndO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] array = { "x", "x", "o", "o", "x", "o", "x", "o", "x" };
		array = startGame(array);

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

	public static String[] startGame(String[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = " ";
		}
		return array;
	}

	public static boolean isFieldFree(String[] array) {
		String x = "x";
		String o = "o";
		for (int i = 0; i < array.length; i++) {
			if (!array[i].equals(x) && !array[i].equals(x)) {
				return true;
			}
		}
		return false;
	}
	public static String[] makeAMuve(String[] array,int place, String sign) {
		
	}
}
