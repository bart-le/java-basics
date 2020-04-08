public class DiagonalStar {
	public static void printSquareStar(int number) {
		if (number >= 5) {
			for (int row = 1; row <= number; row++) {
				for (int column = 1; column <= number; column++) {
					boolean isStar =
						(row == 1 || row == number)
							|| (column == 1 || column == number)
							|| (row == column)
							|| (column == number - row + 1);

					System.out.print(isStar ? "*" : " ");
					if (column == number) System.out.println();
				}
			}
		} else {
			System.out.println("Invalid Value");
		}
	}
}
