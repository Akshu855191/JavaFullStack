public class Shallow {
    public static void main(String args[]) {
		int array1[][] = {{1,2,3},{4,5}};  
		int array2[][] = Arrays.copyOf(array1,array1.length); // This method is return the copies of array1.
		System.out.println(array2.toString());
 }
}