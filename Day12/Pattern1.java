public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 4; i++) {   // It 
			for(int j = 1; j <= 5; j++) {
				if( j % 2 == 1) {
					System.out.print("#");
				} else {
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
		
	}

}
