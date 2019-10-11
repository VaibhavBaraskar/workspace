
public class move_hart_to_middle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 5; i++) {
			System.out.print("\t \t \t \t \t \t \t \t \t \t ");
			for (int j = 0; j <= 6; j++) {
			//	System.out.print("\t \t \t \t \t \t");

				if ((i == 0 && j % 3 != 0) || (i == 1 && j % 3 == 0) || (i - j == 2) || (i + j == 8))
					System.out.print("* ");
				else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}
	}

}
