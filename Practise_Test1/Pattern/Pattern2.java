public class Pattern2 {
	public static void main(String args[]) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1, p ='A'; j <= i;p++, j++) {

				if (j == i) {
					System.out.print((char)p++);
				}

				else if ((i == 2 && j == 1) || (i == 3 && j == 2) || (i == 4 && j == 1) || (i == 4 && j == 3)
						|| (i == 5 && j == 2) || (i == 5 && j == 4)) {
					System.out.print("0");
				}

				else {
					System.out.print("1");
				}
			}

			System.out.println();
		}

	}

}
