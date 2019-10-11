
public class hart_fill1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 6; j++) {
				if ((i == 0 && j % 3 != 0) || (i == 1 && j % 3 == 0) || (i == 1 && j % 3 != 0) || (i == 2 && j % 3 == 0)
						|| (i == 2 && j % 3 != 0) || (i == 2 && j % 3 == 0) || (i == 2 && j % 3 != 0)
						|| (i == 3 && j / 2 == 1) || (i == 3 && j / 4 == 1) || (i == 4 && j / 2 == 1) || (i - j == 2)
						|| (i + j == 8))
					if (i == 3 && j / 6 == 1) {
						System.out.print(" ");
					} else
						System.out.print("* ");
				else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}
	}

}
