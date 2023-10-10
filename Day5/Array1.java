public class Array1 {
  public static void main(String[] args) {
	// How to create an array
         1. Single dimentional array.
        int arr[] = {1,2,3,4,5,6};
               or
        int[] arr ={1,2,3,4,5,6};
               or
        int arr[] = new int[5];

         2. Multi dimentional array
         int arr[][] ={{1,2,3,4},{5,6,4}};
                  or
         int[][] arr ={{1,2,3,4},{5,6,4}};
                  or
         int[][] arr = new int[4][4];
  }
}
		// 1. Single Dimentional Array
    int arr[] = {1,2,3,4,5};  // Index starting from 0. 
    System.out.println(arr[3]); //arr of 3 index is 4.
	
		
		// Dynamic Array
	/*	Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		char ch[] = new char[size];
		ch[0] = 'A';
		ch[1] = 'B';
		ch[2] = 'C';
		ch[3] = 'D';
		ch[4] = 'E';
		ch[5] = 'F';
		ch[6] = 'G';
		ch[7] = 'H';
		ch[8] = 'I';
		ch[9] = 'J';
		
		System.out.println(ch);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int size = sc.nextInt();
		String str[] = new String[size];
		System.out.println("Enter the value :");
		str[0] = sc.nextLine();
		str[1] = sc.nextLine();
		str[2] = sc.nextLine();
		str[3] = sc.nextLine();
		str[4] = sc.nextLine();
		str[5] = sc.nextLine();
		str[6] = sc.nextLine();
		str[7] = sc.nextLine();
		str[8] = sc.nextLine();
		str[9] = sc.nextLine();
		for(int i = 0; i < str.length; i++) {
		
		System.out.println(str[i]+ " " + i);

		}

	}

}*/