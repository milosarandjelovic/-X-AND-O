package working;

public class XAndO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = { "x", "x", "o", "o", "x", "o", "x", "o", "x" };
		startGame(array);
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
			array[i] = "";
		}
		return array;
	}
}
