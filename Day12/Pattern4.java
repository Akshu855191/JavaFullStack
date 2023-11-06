public class Pattern4 {

	public static void main(String[] args) {
		for(int i = 5; i >=0; i--) {    
			for(int j = i; j < 5; j++) {
				System.out.print(j);
			}
			 for(int j = i, p = 'E'; j >= 1; j--) {
					System.out.print((char)p--);;
				}
			 System.out.println();
		}
	}

}
