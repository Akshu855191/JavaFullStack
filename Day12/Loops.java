public class Loops {

	public static void main(String[] args) {
		
       for(int i = 10; i <= 10; i++) {
    	   System.out.println(i);
    	   for(int j = 10; j <= i; j++) {
    		   System.out.print(j);
    		   break;
    		 }
           }
   }
}
