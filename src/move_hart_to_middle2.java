
public class move_hart_to_middle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 7; i++) {
			System.out.print("\t \t \t \t \t \t \t \t \t \t ");
			for (int j = 0; j <= 10; j++) {
				if (((i == 0 && j % 4 != 0) && (i == 0 && j % 5 != 0) && (i == 0 && j % 6 != 0))
						|| (i == 1 && j % 4 == 0) || (i == 1 && j % 10 == 0) || (i == 2 && j % 5 == 0)
						|| (i == 2 && j % 10 == 0) || (i - j == 2) || (i + j == 12)) {

					if (i == 1 && j == 8) {
						System.out.print("  ");
					} else if (i == 1 && (j == 10)) {
						System.out.print("*");
					}

					else
						System.out.print("* ");

				} else {

					if ((i == 0 && j == 8) || (i == 0 && j == 9) || (i == 1 && j == 6)) {
						System.out.print("* ");
					} else
						System.out.print("  ");

				}

			}
			System.out.println();

		}
	}

}
